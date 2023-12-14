package com.Collection;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class SetExample3 {
	public static void main(String[] args) {
//		Set<String> treeSet = new TreeSet<String>();
//		treeSet.add("Fine");
//		treeSet.add("Good");
//		treeSet.add("Hello");
//		treeSet.add(null);
		
		Set<Employee> treeSet = new TreeSet<Employee>(new NameComparator());
		treeSet.add(new Employee(101,"Black"));
		treeSet.add(new Employee(102,"Allen"));
		System.out.println(treeSet);
	}
}
