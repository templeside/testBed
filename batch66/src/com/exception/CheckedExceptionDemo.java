package com.exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("abc.txt");
		} catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("1");
		System.out.println("2");
		Thread.sleep(1000);
		FileWriter out = new FileWriter("abc.txt");
	}

}
