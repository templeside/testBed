package com.demo.FirstbootProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.FirstbootProject.dao.UserDao;
import com.demo.FirstbootProject.dto.UserRequest;
import com.demo.FirstbootProject.exception.UserNotFoundException;
import com.demo.FirstbootProject.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	
	@Override
	public User saveUser(UserRequest userRequest) {
		User user = new User(null, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
		
		return userDao.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
