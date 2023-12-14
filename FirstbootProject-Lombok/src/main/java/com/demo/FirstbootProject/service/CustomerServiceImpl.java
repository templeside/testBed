package com.demo.FirstbootProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.FirstbootProject.dao.CustomerDAO;
import com.demo.FirstbootProject.exception.UserNotFoundException;
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
		return customerDAO.findAll();
	}

	@Override
	public Customer findById(Integer id) throws UserNotFoundException{
		Optional<Customer> result = customerDAO.findById(id);
		if(result.isPresent())
			return result.get();
		else {
			throw new UserNotFoundException("Customer not Present in DB"+id);
		}
	}

	@Override
	public String deleteById(Integer id) {
		customerDAO.deleteById(id);
		return "Data Deleted";
	}

	@Override
	public String updateById(Customer customer) {
		if(!customerDAO.existsById(customer.getId()))
			return "failed";
		
		Customer target = customerDAO.getOne(customer.getId());
		if(customer.getAddress()!=null) target.setAddress(customer.getAddress());
		if(customer.getMobileNo()!=null) target.setMobileNo(customer.getMobileNo());
		if(customer.getName()!=null) target.setName(customer.getName());
		customerDAO.save(target);
		
		return "Data Saved";
	}
}
