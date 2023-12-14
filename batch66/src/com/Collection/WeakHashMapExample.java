package com.Collection;

import java.util.WeakHashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

public class WeakHashMapExample  {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Map<Customer, String> map =  new WeakHashMap<>();
		Customer c1 = new Customer(1,"Allen","23456");
		Customer c2 = new Customer(2,"Black","567890");
		map.put(c1,  "Allen");
		map.put(c2,  "Black");
		
		c1 = null;
		c2 = null;
		System.out.println(map);
		System.gc();
		Thread.sleep(1000);	//it will be finalized after this block
		System.out.println(map);
	}
}
