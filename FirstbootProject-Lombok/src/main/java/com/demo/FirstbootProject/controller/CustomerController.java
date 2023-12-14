package com.demo.FirstbootProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.FirstbootProject.dto.CustomerRequest;
import com.demo.FirstbootProject.exception.UserNotFoundException;
import com.demo.FirstbootProject.model.Customer;
import com.demo.FirstbootProject.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/msg") // msg-- EndPoints-- which is helping to call the method
	public String getMessage() {

		return "Welcome to REST API from Customer";
	}

//	@PostMapping("/save")
//	public String save(@Valid @RequestBody CustomerRequest customer) {
//		String msg = customerService.save(customer);
//		return msg;
//	}

	@GetMapping("/fetchAll")
	public List<Customer> fetchAll()throws UserNotFoundException {
		return customerService.findAll();
	} 

	@GetMapping("/fetchById")
	public Customer fetchByIdPath(@RequestParam("id") Integer id) throws UserNotFoundException {
		return customerService.findById(id);
	}
	
	@GetMapping("/fetchById/{id}")
	public ResponseEntity<Customer> fetchById(@PathVariable Integer id) throws UserNotFoundException{
		return ResponseEntity.ok(customerService.findById(id));
    }

	@DeleteMapping("/deleteById")
	public String deleteByIdPath(@RequestParam("id") Integer id) {
		String msg = customerService.deleteById(id); 
		return msg;
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable Integer id) {
		String msg = customerService.deleteById(id); 
		return msg;
	}
	
	@PatchMapping("/updateById")
	public String updateById(@RequestBody Customer customer) {
		String msg = customerService.updateById(customer); 
		return msg;
	}
}
