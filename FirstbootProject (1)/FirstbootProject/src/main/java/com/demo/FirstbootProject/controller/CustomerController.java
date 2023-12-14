package com.demo.FirstbootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.FirstbootProject.model.Customer;
import com.demo.FirstbootProject.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/msg") // msg-- EndPoints-- which is helping to call the method
	public String getMessage() {

		return "Welcome to REST API from Customer";
	}

	@PostMapping("/save")
	public String save(@RequestBody Customer customer) {

		String msg = customerService.save(customer);
		return msg;
	}

}
