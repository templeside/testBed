package com.Collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Hello");
		hashSet.add(null);
		hashSet.add("Fine");
		hashSet.add("Good");
		hashSet.add("========");
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========");
		
		String[] names = (String[]) hashSet.toArray();
		
		
	}

}
