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

public class MapExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> hashSet = new HashSet<String>();
		list.add(null);
		hashSet.add(null);
		
		Map<String, String> m = new LinkedHashMap<>();
		m.put("1", "Allen");
		m.put("2", "Black");
		m.put("3", "Max");
		m.put("4", "James");
		
		m.put("Good ", "Allen");
		m.put("Hi", "Black");
		m.put("Welcome", "Max");
		m.put("Fine", "James");
		System.out.println(m);
		
		Set set=  m.entrySet();	//first, map into a set.
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) itr.next();
			System.out.println("Key="+entry.getKey()+", value="+entry.getValue());
		}
		
//		Iterator<> itr1 = m.iterator(); entry
	}
}
