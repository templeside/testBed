package com.Collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample1 {
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(101, "Allen"));
		employees.add(new Employee(101, "Allen"));
		System.out.println(employees);
	}
}
