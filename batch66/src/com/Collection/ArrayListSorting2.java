package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting2 {

	public static void main(String[] args) {
		List list = new ArrayList();// it is convenient than below
		// ArrayList list = new ArrayList();
		
		list.add(new Employee(103, "hehe"));
		list.add(new Employee(101, "Black"));
		list.add(new Employee(102, "Allen"));
		
		
		System.out.println(list);
		Collections.sort(list, new IdComparator());
		System.out.println(list);
		
		Collections.sort(list, new NameComparator());
		System.out.println(list);
	}

}
