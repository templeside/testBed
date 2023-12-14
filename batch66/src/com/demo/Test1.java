package com.demo;

public class Test1 {
	int x=10;
	static int y = 100;
	
	public static void main(String[] args) {
		Test t1 = new Test(100);
//		t1.getValue();
		
		Employee emp = new Employee(101, "Allen", 123);
		System.out.println(emp.getID()+", "+ emp.getName()+", "+ emp.getSalary());
	}
}