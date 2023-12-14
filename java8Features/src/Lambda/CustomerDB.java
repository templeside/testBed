package Lambda;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class CustomerDB {
	public static List<Customer> getAllCustomer(){
		return Stream.of(
				new Customer(101, "Allen", "allen@gmail.com", Arrays.asList("67896540","9807654")),
				new Customer(102, "Black", "black@gmail.com", Arrays.asList("6789654045","459807654")),
				new Customer(103, "James", "james@gmail.com", Arrays.asList("5667896540", "9678807654")),
				new Customer(104, "Max", "max@gmail.com", Arrays.asList("67867896540", "67899807654")))
				.collect(Collectors.toList());
	}
}
/*
 * how to convert List into Stream?
 * 1. list.stream()
 * 2. Stream.of()
 * how to convert Stream into a List
 * 1. Collectors.toList();
 */
