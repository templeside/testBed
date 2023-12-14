package com.demo;

public class Dog extends Animal{
	static {
		System.out.println("Dog static block");
	}
	Dog(int y){
		super(20);
		System.out.println("Dog Constructor"+ y);
	}
	{
		System.out.println("Dog Instance Block");
	}
	void eat() {
		super.eat();
		System.out.println("Dog eat");
	}
}
