package com.designpattern.factory;

public class FactoryTest {
	public static void main(String[] args) {
		FactoryClass fclass = new FactoryClass();
		Employee e = fclass.getEmployee("Software");
		Employee e1 = fclass.getEmployee("Permanent");
		Employee e2 = fclass.getEmployee("Contract");
		e.work();
		e1.work();
		e2.work();
	}
}
