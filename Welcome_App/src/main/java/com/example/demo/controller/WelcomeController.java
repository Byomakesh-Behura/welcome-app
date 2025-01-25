package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my world";
	}
	
	@GetMapping("/wish/{name}")
	public String wish(@PathVariable String name) {
		return "Good Morning "+name;
	}

}
