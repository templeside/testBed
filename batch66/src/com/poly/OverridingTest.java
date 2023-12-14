package com.poly;

public class OverridingTest {
	public static void main(String[] args) {
		Parent p = new Child();	// overriding. only for overriding methods.
		p.test();
		p.print();		//child거 쓰고 싶은데 child overriding 안 쓴 건 안 사용할 때
		
		Child c = new Child();	//inheritance
		c.test();
		c.print();
	}
}
