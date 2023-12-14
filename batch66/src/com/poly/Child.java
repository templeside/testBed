package com.poly;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent{
	@Override
	public ArrayList test() {
		System.out.println("Child Test");
		return new ArrayList();
	}
	void print() {
		System.out.println("Child Print");
	}
}
