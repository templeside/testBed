package com.poly;

class Test{
	void print() {
		System.out.println("First Print");
	}
	void print(int x) {		//overloading
		System.out.println("Second Print "+x);
	}
}
public class OverloadingExample {
	public static void main(String[] args) {
		Test t = new Test();
		t.print(10);
		t.print();
		
	}
}
