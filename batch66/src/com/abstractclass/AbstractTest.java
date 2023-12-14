package com.abstractclass;

public class AbstractTest {

	public static void main(String[] args) {
		//can't create instance of abstract class
		// we must have to override abstract method into a child class
		// concrete (method who has a body) method is optional to override
		Animal animal = new Dog();
		animal.eat();
		animal.animalTest();
		animal.dogTest(); // 불가능. dog에만 있기 때문.
	}
}
