package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
		List list = new ArrayList();// it is convenient than below
		// ArrayList list = new ArrayList();
		list.add("Welcome");
//		list.add(null);
		list.add("Hello");
//		list.add(345.8);
		list.add("Fine");

		Collections.sort(list);
		System.out.println(list);
	}

}
