package com.demo.FirstbootProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.FirstbootProject.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
}
