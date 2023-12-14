package com.demo;

import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;

public class StringEnhancement {
	public static void main(String[] args) {
		String message = "Welcome ";
		System.out.println(message.repeat(10));
		
		String message1 = "Hi Hello How are you";
		List<String> result = message1.lines().collect(Collectors.toList());
		System.out.println(result.get(0));
		
		List<Employee> employees = Collections.singletonList(new Employee(101, "Allen", 123));
		System.out.println(employees);
		
		String message2="    Allen       ";
		System.out.println(message2.strip());
		System.out.println(message2.stripLeading());
		System.out.println(message2.stripTrailing());
	}
}
