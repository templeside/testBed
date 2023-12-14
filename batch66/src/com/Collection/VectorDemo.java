package com.Collection;

import java.util.Vector;
import java.util.Enumeration;
import java.util.List;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list = new Vector<String>();
		list.add("Hello");
		list.add("Welcome");
		list.add("I am fine");
		System.out.println(list);
		System.out.println(list.get(1));
		list.remove(0);
		System.out.println(list.contains("Welcome"));
		
		Enumeration<String> enumeration = list.elements();
		
		System.out.println(enumeration);
		while(enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());
	}

}
