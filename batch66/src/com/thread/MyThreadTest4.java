package com.thread;

public class MyThreadTest4 {
	public static void main(String[] args) throws InterruptedException {
		Thread7 t1 = new Thread7();
		Thread8 t2 = new Thread8();
		Thread thread1 = new Thread(t1); //새 thread에 넣어서 start함.
		Thread thread2 = new Thread(t2); //새 thread에 넣어서 start함.
		thread1.start();
		thread2.start();
		
		for(int i=11; i<=15; i++) {
			Thread t = new Thread();
			t.join();
			System.out.println(i+","+Thread.currentThread().getName()+" , "+ Thread.currentThread().getPriority());
			
		}
	}
}
class Thread7 implements Runnable{ //extend가 아닌implement
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+","+Thread.currentThread().getName()+" , "+ Thread.currentThread().getPriority());
		}
	}
}

class Thread8 implements Runnable{ //extend가 아닌implement
	@Override
	public void run() {
		for(int i=6; i<=10; i++) {
			System.out.println(i+","+Thread.currentThread().getName()+" , "+ Thread.currentThread().getPriority());
		}
	}
}