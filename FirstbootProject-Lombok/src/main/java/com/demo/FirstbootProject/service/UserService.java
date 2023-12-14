package com.demo.FirstbootProject.service;

import java.util.List;

import com.demo.FirstbootProject.dto.UserRequest;
import com.demo.FirstbootProject.exception.UserNotFoundException;
import com.demo.FirstbootProject.model.User;

public interface UserService {
	public User saveUser(UserRequest userRequest);
	public List<User> getAllUsers();
	public User getUser(int id) throws UserNotFoundException;
}
