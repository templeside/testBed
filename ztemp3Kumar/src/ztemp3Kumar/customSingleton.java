package ztemp3Kumar;

public class customSingleton {
	//“volatile” tells the compiler that the value of a variable must never be cached as its value may change
	// for double checked locking mechanism
	private static volatile customSingleton instance;
	
	private customSingleton() {
	}
	public static synchronized customSingleton getInstance() {
		if(instance ==null)
			instance = new customSingleton();
		return instance;
	}
}
