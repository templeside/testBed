package com.demo.FirstbootProject.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("hello")
public class HelloController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@GetMapping("/msg")
	 // msg-- EndPoints-- which is helping to call the method
	@ResponseBody
	public String getMessage() {

		return "Welcome to REST API";
	}

	@GetMapping("/greeting")
	public ResponseEntity<String> getMessage1() {

		ResponseEntity<String> msg = new ResponseEntity<String>("Good afternoon", HttpStatus.BAD_REQUEST);

		return msg;
	}
}

//CRUD Operation with DB
