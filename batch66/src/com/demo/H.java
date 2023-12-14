package com.demo;


class H {
	void test() {
		System.out.println("We are best friends");
	}
	public static void main(String[] args) {
		H h=new H();
		System.out.println("I am main() method");
		h.test();
	}
	static {
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}
}
