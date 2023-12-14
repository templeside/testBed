package com.demo.FirstbootProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.FirstbootProject.dao.CustomerDAO;
import com.demo.FirstbootProject.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String save(Customer customer) {
		 customerDAO.save(customer);
		return "Data Saved";
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
