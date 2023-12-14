package com.thread;

public class MyThreadTest {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		for(int i=11; i<=15; i++) {
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i= 6; i<=10; i++) {
			System.out.println(i);
		}
	} 
}