package com.thread;

public class MyThreadTestRunnable {
	public static void main(String[] args) {
		Thread3 t1 = new Thread3();
		Thread4 t2 = new Thread4();
		Thread thread1 = new Thread(t1); //새 thread에 넣어서 start함.
		Thread thread2 = new Thread(t2); //새 thread에 넣어서 start함.
		thread1.start();
		thread2.start();
		
		for(int i=11; i<=15; i++) {
			System.out.println(i);
		}
	}
}
class Thread3 implements Runnable{ //extend가 아닌implement
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
}

class Thread4 implements Runnable{
	@Override
	public void run() {
		for(int i= 6; i<=10; i++) {
			System.out.println(i);
		}
	} 
}