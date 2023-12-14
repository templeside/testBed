package com.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("Hello", "Allen");
		treeMap.put("Fine", "Black");
		treeMap.put("Welcome","James");
		System.out.println(treeMap);
	}
}
