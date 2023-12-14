package Lambda;

public interface Animal {
//	void test();
	
	//with parameter
//	void test(int x, int y);
	
	//with parameter && return values
	int test(int x, int y);
	
	default void test1() {
		System.out.println("From Default Method");
	}
	
	public static void test2() {
		System.out.println("From Static Method");
	}
}
