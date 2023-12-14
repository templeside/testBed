package com.demo.FirstbootProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {
	@GetMapping("/msg")// msg-- EndPoints-- which is helping to call the method
	public String getMessage() {
		
		return "Welcome to REST API from Admin";
	}

}
