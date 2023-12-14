package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSorting3 {

	public static void main(String[] args) {
		List list = new ArrayList();// it is convenient than below
		// ArrayList list = new ArrayList();
		
		list.add(new Employee(103, "hehe"));
		list.add(new Employee(101, "Black"));
		list.add(new Employee(102, "Allen"));
		
		Comparator<Employee> idComparator = (Employee o1, Employee o2)-> o1.getId().compareTo(o2.getId());
		Comparator<Employee> nameComparator = (Employee o1, Employee o2)-> o1.getName().compareTo(o2.getName());
		
		System.out.println(list);
		//Collections.sort(list, new IdComparator()); 
		Collections.sort(list, idComparator);	//위에 것과 같은 것.
		System.out.println(list);

		//Collections.sort(list, new NameComparator()); 
		Collections.sort(list, nameComparator);	//위에 것과 같은 것.
		System.out.println(list);
	}

}
