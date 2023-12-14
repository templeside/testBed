package com.exception;

import com.demo.Test;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		t.setValue(10);
		t1.setValue(100);
		t2.setValue(1000);
		t3.setValue(2000);
		System.out.println(t.getValue()+", "+ t1.getValue()+", "+t2.getValue()+", "+t3.getValue());
	}
}

class Test{
	int value;
	int getValue() {
		return value;
	}
	void setValue(int value) {
		this.value = value;
	}
}