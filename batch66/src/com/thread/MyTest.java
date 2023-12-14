package com.thread;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessTest processTest = new ProcessTest();
		processTest.test();
		processTest.test1();
		for(int i=11; i<=15; i++) {
			System.out.println(i);
		}
	}

}

class ProcessTest{
	void test() {
		for(int i=6; i<=10; i++) {
			System.out.println(i);
		}
	}
	void test1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
}
