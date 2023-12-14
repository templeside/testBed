package com.poly;
import java.util.ArrayList;
import java.util.List;

public class Parent {
	ArrayList test() {
		System.out.println("Parent Test");
		return new ArrayList();
	}
}
// every method or variable will have access modifier
// private, default, protected, public.
// currently, default modifier.

// during the overriding of method, return value of the method in child class 
// would be the same type of parent class method or child of it 