package com.designpattern.factory;

public class Permanent implements Employee{
	private int monthly;
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Permanent Employee");
	}

}
