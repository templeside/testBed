package com.exception;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println("String containing null value. "+ e.getMessage());
		}
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
	}
}
