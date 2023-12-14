package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1,"Allen", 23456,"NY","4567890"),
				new Employee(2,"Black", 5678,"Pitts","908754"),
				new Employee(3,"Max", 543,"NJ","4567890"),
				new Employee(4,"James", 3467,"NY","3456789")
				);
		
		// i want to know people who is living in NY
		List<Employee> employe = employees.stream()
				.filter(employee-> employee.getAddress().equals("NY"))
				.collect(Collectors.toList());
		
		System.out.println(employe);
		
		// i want to know the salaries of people living in NY
		List<Long> salaries = employees.stream()
				.filter(employee-> employee.getAddress().equals("NY"))
				.map(employee -> employee.getSalary())
				.collect(Collectors.toList());
		System.out.println(salaries);
	}
}
