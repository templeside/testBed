package StringHandling;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101,"Allen");
		Employee e1 = new Employee(101,"Allen");
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		
		System.out.println(e ==e1);
		System.out.println(e.equals(e1));
		
		System.out.println(e+", "+ e.toString());
	}

}
