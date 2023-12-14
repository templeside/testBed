package com.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class MapIterationUsingStream {

	public static void main(String[] args) {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("2", "Allen");
		m.put("3", "Max");
		m.put("4", "James");
		m.put("Hi", "Black");
		m.put("Welcome", "Max");
		m.put("Fine", "Max");

		//this is for single key
		String result=null;
		for (Map.Entry<String, String> entry1 : m.entrySet()) {
			if (entry1.getValue().equals("Allen")) {
				result = entry1.getKey();
			}
		}
		System.out.println("Key of Allen=" + result);

		// this is for getting multiple keys
		List<String> result1= new ArrayList<>();
		for (Map.Entry<String, String> entry1 : m.entrySet()) {
			if (entry1.getValue().equals("Max")) {
				result1.add(entry1.getKey());
			}
		}
		System.out.println("Key of Allen=" + result1);

		// java 8 style
		Map<String,String> keys = m.entrySet().stream()				//map -> stream
				.filter(name -> name.getValue().equals("Max"))		//filtering out conditions -> stream
				.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));	// stream -> map
		System.out.println(keys);
	}

}
