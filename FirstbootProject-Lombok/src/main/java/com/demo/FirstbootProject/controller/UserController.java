package com.demo.FirstbootProject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.FirstbootProject.dto.UserRequest;
import com.demo.FirstbootProject.model.User;
import com.demo.FirstbootProject.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
		return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
	}
}
