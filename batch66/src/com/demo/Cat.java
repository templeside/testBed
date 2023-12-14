package com.demo;

public class Cat extends Dog {
	static {
		System.out.println("Cat static block");
	}
	Cat(){
		super(10);
		System.out.println("Cat constructor");
	}
	{
		System.out.println("Cat instance block");
	}
	void eat() {
		super.eat();
		System.out.println("Cat eat");
	}
}
