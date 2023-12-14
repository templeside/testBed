package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Allen","Black","James","Max"};
		
		//array -> list
		Stream<String> stream = Arrays.stream(names);	//array -> stream
		List<String> lists = stream.collect(Collectors.toList());  //stream - list
		System.out.println(lists);
		
		
		//converting List into Map using stream
		List<Customer> customers = CustomerDB.getAllCustomer();
		Map<Object, Long> result = customers.stream()
				.collect(Collectors.groupingBy(c -> c.getName(), Collectors.counting()));
		System.out.println(result);
	}
}
