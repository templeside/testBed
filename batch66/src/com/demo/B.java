package com.demo;

public class B {
	B(){
		
	}
	B(int i){
		System.out.println("I can overload");
	}
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("Hello World!");
	}
	{
		System.out.println("From IIB");
	}

}
