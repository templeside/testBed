package com.demo.FirstbootProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.FirstbootProject.model.Customer;

// JpaRepository<T, ID>
//JPA java persistence API, it is abstraction over the hibernate

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
