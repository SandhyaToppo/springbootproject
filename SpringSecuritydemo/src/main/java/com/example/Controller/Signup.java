package com.example.Controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Role;
import com.example.entity.User;
import com.example.service.MyUserDetailsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Signup {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private MyUserDetailsService userDetailsService;

	@PostMapping(path = "/signup") //
	public ResponseEntity<Object> createUser(@RequestBody @Valid User user) {
		// Map<String, String> errors = new HashMap<>();
		// String field = null;
		// String message = null;
		// try {
		String pwd = user.getPassword();
		String bcryptpwd = passwordEncoder.encode(pwd);
		user.setPassword(bcryptpwd);
		Set<Role> roles = new HashSet<>();
		roles.add(new Role(1, "USER"));
		user.setRoles(roles);
		User savedUser = userDetailsService.addUser(user);
		return new ResponseEntity<Object>(savedUser, HttpStatus.CREATED);
	}
}