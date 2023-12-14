package Lambda;

public class LambdaExpression implements Animal {
	public static void main(String[] args) {
//		without parameter
//		Animal a = () -> System.out.println("Lamda Expression with single line");
//		Animal a1 = () -> {
//			System.out.println("Lamda Expression with multi line");
//		};
//		a.test();
//		a1.test();
		
//		// with parameter
//		Animal a = (int x, int y) -> System.out.println("Lamda Expression with single line"+(x+y));
//		Animal a1 = (int x, int y) -> {
//			System.out.println("Lamda Expression with multi line"+(x+y));
//		};
//		a.test(10,20);
//		a1.test(30,40);

		
		//parameters with return value
		Animal a = (int x, int y) -> x+y;
		Animal a1 = (int x, int y) -> {
			System.out.println("Lamda Expression with multi line"+(x+y));
			return x+y;
		};
		
		Animal a2 = new LambdaExpression();
		System.out.println(a.test(10,20));
		System.out.println(a1.test(30,40));
		a2.test1();
		Animal.test2();
	}
		
	@Override
	public int test(int x, int y) {
		return 0;
	}
	
	@Override
	public void test1() {
		System.out.println("From Default Method of Child class");
	}
	
//	public static void test2() {
//		System.out.println("From Method");
//	}
}

