package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class MapExample2 {

	public static void main(String[] args) {

		/*
		 * List<String> list = new ArrayList<String>(); Set<String> hashSet = new
		 * HashSet<String>(); list.add(null); hashSet.add(null);
		 */

		Map<String, String> m = new LinkedHashMap<String, String>();

		//m.put("1", null);
		m.put("2", "Allen");
		m.put("3", "Max");
		m.put("4", "James");

		//m.put("Good", null);
		m.put("Hi", "Black");
		m.put("Welcome", "Max");
		m.put("Fine", "Max");
		// System.out.println(m);
		// Iterator<String> itr=list.iterator();

		Set set = m.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<String, String> entry = (Map.Entry<String, String>) itr.next();
			System.out.println("Key= " + entry.getKey() + ", value= " + entry.getValue());
		}
		
		String result=null;
		for (Map.Entry<String, String> entry1 : m.entrySet()) {
			if (entry1.getValue().equals("Allen")) {
				result = entry1.getKey();
			}
		}
		System.out.println("Key of Allen=" + result);
	}

}