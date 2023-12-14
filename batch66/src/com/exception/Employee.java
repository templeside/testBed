package com.exception;

public class Employee{
	void test(){
		 try {
			 Class.forName("abc.txt");
		 } 
		 catch (ClassNotFoundException e) {
			 System.out.println("abc.txt");
		 }
	}
}
