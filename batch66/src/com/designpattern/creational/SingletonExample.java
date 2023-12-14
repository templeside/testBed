package com.designpattern.creational;

class Employee {
	private int id;
	private String name;
	private static Employee getEmployee =null;
	
	private Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static Employee getInstance() {
		if (getEmployee == null) {
			getEmployee = new Employee(101, "Allen");
		}
		return getEmployee;
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		Employee e = Employee.getInstance();
		Employee e1 = Employee.getInstance();
		Employee e2 = Employee.getInstance();
		
		System.out.println(e.hashCode()+","+e1.hashCode()+","+e2.hashCode());
	}
}
