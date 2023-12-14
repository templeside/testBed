package com.demo;

public class Animal extends Object{
	static {
		System.out.println("Animal static block");
	}
	Animal(int x){
		System.out.println("Animal Constructor" + x);
	}
	void eat() {
		System.out.println("Animal eat");
	}
	void test() {
		System.out.println("Animal test");
	}
}
