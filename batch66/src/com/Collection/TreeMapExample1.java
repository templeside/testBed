package com.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		/*
		 * Map<String, String> treeMap = new TreeMap<>(); treeMap.put("Hello", "Allen");
		 * treeMap.put("Fine", "Black"); treeMap.put("Welcome", "JAmes");
		 * System.out.println(treeMap);
		 */
		
		Map<Employee, String> treeMap = new TreeMap<>(new NameComparator());
		treeMap.put(new Employee(1, "Black"), "Allen");
		treeMap.put(new Employee(3,"James"), "Black");
		treeMap.put(new Employee(2, "Allen"), "JAmes");
		System.out.println(treeMap);

	}

}