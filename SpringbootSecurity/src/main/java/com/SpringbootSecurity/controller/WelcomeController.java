package com.SpringbootSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("codezup")
public class WelcomeController {
	@GetMapping
	public String welcomeInSpringSecurity() {
		return "Welcome to Spring Security Basic Project";
	}
}
