package OptionalExample;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) throws Throwable {
		Optional<String> value = Optional.of("Allen");
		Optional value1 = Optional.empty();
		Optional value2 = Optional.ofNullable("Black");
		//singleton is for preventing object is out of the class.
		
//		System.out.println(value);
//		System.out.println(value1);
//		System.out.println(value2);
//		System.out.println(value.get());
//		System.out.println(value1.get());// null이라 nosuchelementexception

		Optional<String> val = value.filter(a-> a.equals("Allen")).map(x-> x.toLowerCase());
		System.out.println(val.get());
		
		//filter & orElse & orElseGet & orElseThrow
		Optional<String> value3 = Optional.ofNullable(null);
		System.out.println(value3.filter(a->a.equals("Allen")));
		System.out.println(value3.filter(a->a.equals("Allen")).orElse("Some thing else"));
		System.out.println(value3.filter(a->a.equals("Allen")).orElseGet(()->"N/A"));
//		System.out.println(value3.filter(a->a.equals("Allen")).orElseThrow(()-> new RuntimeException("Value not present")));
		
		
		
		Optional value4 = Optional.ofNullable("HI");
		value4.ifPresent(x-> System.out.println("Value not present"));
		System.out.println(value4.isPresent());
	}
}
