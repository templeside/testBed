package com.designpattern.factory;

public class Contract implements Employee{
	private int hr;
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee");
	}

}
