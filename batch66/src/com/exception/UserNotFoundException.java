package com.exception;

public class UserNotFoundException extends Exception{//checked exception
	UserNotFoundException(String msg){
		super(msg);
	}
} 

