package Lambda;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapVSMapExample {

	public static void main(String[] args) {
		List<Customer> customers = CustomerDB.getAllCustomer();
		
		//to get customer names
		List<String> customerNames = customers.stream()
				.map(customer-> customer.getName()) 
				.collect(Collectors.toList());
		System.out.println(customerNames);
		
		//to get mobile number lists
		List<List<String>> customerMobileNo = customers.stream()
				.map(customer-> customer.getMobileNo()) 
				.collect(Collectors.toList());
		System.out.println(customerMobileNo);
		
		//flatmap 사용해서 list flat하게 만들기
		List<String> flatCustomerMobileNo = customers.stream()
				.flatMap(customer-> customer.getMobileNo().stream())
				.collect(Collectors.toList());
		System.out.println(flatCustomerMobileNo);
	}
}
