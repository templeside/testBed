package com.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List linkedlist = new LinkedList();
		linkedlist.add(100);
		linkedlist.add(100.5);
		linkedlist.add("Hello");
		linkedlist.add(null);
		System.out.println(linkedlist);

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
