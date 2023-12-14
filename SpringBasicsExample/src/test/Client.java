package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Address;
import model.Employee;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Bean1.xml");
		Employee e = (Employee) ap.getBean(Employee.class);
		Address add = e.getAddress();
		
		e.setId(101);
		e.setName("Allen");
		e.setEmail("Allent@gmail.com");
		add.setId(102);
		add.setStreet("PY");
		add.setCity("PY");
		add.setCountry("USA");
		
		System.out.println(e.getId() +","+e.getName()+","+e.getEmail());
		System.out.println(add.getId()+","+add.getCity()+","+add.getCountry()+","+add.getStreet());
	}
}
