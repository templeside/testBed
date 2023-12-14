package com.demo;

import java.util.Optional;

public class OptionalExamples {
	public static void main(String[] args) {
		Optional option = Optional.of("Welcome");
		Optional option1 = Optional.ofNullable("HI");
		Optional option2 = Optional.empty();
		
		System.out.println(option.isEmpty());
		System.out.println(option1.isEmpty());
		
		var id = 101;
	}
}
