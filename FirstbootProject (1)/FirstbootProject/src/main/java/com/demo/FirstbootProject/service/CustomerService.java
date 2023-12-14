package com.demo.FirstbootProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.FirstbootProject.model.Customer;
//@Service
public interface CustomerService {
	
	public String save(Customer customer);
	public List<Customer> findAll();
	public Customer findById(Integer id);

}
