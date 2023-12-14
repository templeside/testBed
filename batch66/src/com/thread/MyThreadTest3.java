package com.thread;

public class MyThreadTest3 {
	public static void main(String[] args) throws InterruptedException {
		Thread5 t1 = new Thread5();
		Thread6 t2 = new Thread6();
		Thread thread1 = new Thread(t1); //새 thread에 넣어서 start함.
		Thread thread2 = new Thread(t2); //새 thread에 넣어서 start함.
		thread1.start();
		thread2.start();
		
		for(int i=11; i<=15; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
class Thread5 implements Runnable{ //extend가 아닌implement
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class Thread6 implements Runnable{
	@Override
	public void run() {
		for(int i= 6; i<=10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
}