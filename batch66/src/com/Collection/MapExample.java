package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class MapExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> hashSet = new HashSet<String>();
		list.add(null);
		hashSet.add(null);
		Map<String, String> m = new HashMap<>();
		m.put("1", "Allen");
		m.put("2", "Black");
		m.put("3", "Max");
		m.put("4", "James");
		
		m.put("Good ", "Allen");
		m.put("Hi", "Black");
		m.put("Welcome", "Max");
		m.put("Fine", "James");
		System.out.println(m);
	}
}
