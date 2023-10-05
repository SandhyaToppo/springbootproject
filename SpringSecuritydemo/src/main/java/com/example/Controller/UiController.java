package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {

	@GetMapping("/home")
	public String home() {
		return "Hello everyone";
	}

	@GetMapping("/secure")
	public String secure() {
		return "This is secure page";
	}

	@GetMapping("/getall")
	public String getall() {
		return "give access to all";
	}

}
