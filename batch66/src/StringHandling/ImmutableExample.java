package StringHandling;

public class ImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "Hello";
		String str = new String("Hello");
		String str1 = str.concat("Welcome");
		String str2 = str1.concat("I am fine");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		StringBuffer str3 = new StringBuffer("Hello");
		StringBuffer str4 = str3.append("Welcome");
		StringBuffer str5 = str4.append("I am fine");
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
