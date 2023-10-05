package com.example.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@EnableWebSecurity
@Configuration
@Service
public class AppConfigSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable();

		http.authorizeRequests().antMatchers("/signup", "/getall").permitAll().and().authorizeRequests()
				// .antMatchers(HttpMethod.GET,
				// "/doctor/**").permitAll().and().authorizeRequests()
				.antMatchers("/users/**").hasAnyAuthority("admin").antMatchers(HttpMethod.GET, "/secure")
				.hasAnyAuthority("admin")
				// .antMatchers(HttpMethod.POST, "/doctors/**").hasAnyAuthority("admin")

				// .antMatchers(HttpMethod.DELETE, "/appointments/**").hasAnyAuthority("admin")
				.antMatchers(HttpMethod.GET, "/home").hasAnyAuthority("USER").anyRequest().authenticated().and()
				.formLogin().permitAll().and().httpBasic();
	}

}
