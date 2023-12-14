package com.designpattern.creational;

public class SingletonDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		t.setValue(10);
		t1.setValue(100);
		t2.setValue(1000);
		t3.setValue(2000);
		System.out.println(t.getValue()+", "+ t1.getValue()+", "+t2.getValue()+", "+t3.getValue());
	}
}

class Test1{
	int value;
	int getValue() {
		return value;
	}
	void setValue(int value) {
		this.value = value;
	}
}