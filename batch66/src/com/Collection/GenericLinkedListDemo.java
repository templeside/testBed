package com.Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GenericLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Hello1");
		linkedlist.add("HIIIII");
		linkedlist.add("Hello");
		
		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.remove(1));
		System.out.println(linkedlist.contains("Hell"));
		System.out.println(linkedlist.indexOf("Hello"));
				
		
		Collections.synchronizedList(linkedlist);
		
		Iterator itr = linkedlist.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			itr.remove();
//		}
		
		ListIterator listIterator = linkedlist.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println(listIterator.hasPrevious());
		System.out.println(listIterator.nextIndex());
		System.out.println(listIterator.previousIndex());
		System.out.println(listIterator.previous());
		
		
		System.out.println(linkedlist);
	}

}
