package syncrhonizationexample;

//class MyThread extends Thread{
//Display d;
//String name;
//
//MyThread(Display d, String name){
//	this.d = d;
//	this.name = name;
//}
//public void run() {
//	d.wish(name);
//}
//}
class MyThread implements Runnable{
	Display d;
	String name;
	
	MyThread(Display d, String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}

//public class SyncrhonizedDemo {
//public static void main(String[] args) {
//	 Display d = new Display();
//	 MyThread t1 = new MyThread(d, "Allen");
//	 MyThread t2 = new MyThread(d, "Black");
//	 t1.start();
//	 t2.start();
//}
//}
public class SyncrhonizedDemo {
	public static void main(String[] args) {
		 Display d = new Display();
		 MyThread t1 = new MyThread(d, "Allen");
		 MyThread t2 = new MyThread(d, "Black");
		 Thread thread1 = new Thread(t1);
		 Thread thread2 = new Thread(t2);
		 thread1.start();
		 thread2.start();
	}
}

