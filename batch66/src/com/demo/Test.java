package com.demo;

public class Test {
	int x;
	Test(){
		
	}
	Test(int x){
		this.x = x;
	}
	public int getValue() {
		System.out.println(this.x);
		return x;
	}
	
	public static void main(String[] args) {
		//syntax of creating object/instance
		Test t1 = new Test();
//		Employee emp = new Employee();
//		emp.setID(2);
//		emp.setName("Allen");
//		emp.setSalary(123);
		Employee emp = new Employee(2,"Allen", 123);
		System.out.println(emp.getID()+", "+ emp.getName()+
				", "+ emp.getSalary());
	}
}