package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ToArrayDemo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101, "Allen", 123));
		employees.add(new Employee(102, "Black", 234));
		Employee[] employees2 = employees.toArray(size->new Employee[size]);
	
		System.out.println(Arrays.toString(employees2));
	}
}
