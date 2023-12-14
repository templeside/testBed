package com.demo;

class Demo{
	final int x =10;
	final void test() {
		x=20;
		System.out.println(x);
	}
}
class Demo1 extends Demo{
	@override
	void test() {
		
	}
}
public class FinalExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.test();
	}
}
