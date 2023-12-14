package com.demo;

import java.util.regex.Pattern;

public class PredicateExample {

	public static void main(String[] args) {
		var str = Pattern.compile("aba").asMatchPredicate();
		
		System.out.println(str.test("aba"));
		System.out.println(str.test("abaaa"));

	}
}
