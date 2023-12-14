package com.Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hashTable = new Hashtable<String, String>();
//		hashTable.put(null, null);// it is not working cuzz having null value.
//		hashTable.put("null", null);// it is not working cuzz having null value.
//		hashTable.put(null, "null");// it is not working cuzz having null value.
		hashTable.put("null", "Allen");
		hashTable.put("Fine", "Black");
//		System.out.println(hashTable);
	}
}
// Hashtable - null key and value will not be allow
// hastable is thread-safe(syncrhonized), and its a legacy class