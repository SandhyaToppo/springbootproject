package com.example.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.MyUserDetailsService;

@RestController
public class UserController {
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private MyUserDetailsService userDetailsService;

	@PostMapping(path = "/users") //
	public ResponseEntity<Object> createUser(@RequestBody @Valid User user) {
		Map<String, String> errors = new HashMap<>();
		String field = null;
		String message = null;

		String pwd = user.getPassword();
		String bcryptpwd = passwordEncoder.encode(pwd);
		user.setPassword(bcryptpwd);

		User savedUser = userDetailsService.addUser(user);
		return new ResponseEntity<Object>(savedUser, HttpStatus.CREATED);

	}

	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return userDetailsService.updateUser(user);
	}

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return userDetailsService.getAllUser();
	}

	@GetMapping("/users/{username}")
	public User findByUsername() {
		return userDetailsService.getByUsername();
	}

}
