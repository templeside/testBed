package TempPackage;

public class TempTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String(s1);
		String s4 = new String(s2);
		System.out.println("------");
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s4);
		System.out.println(s3 == s4);
		System.out.println("--------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
