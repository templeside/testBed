package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Customer;

public class FetchCustomerTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Customer customer = (Customer) session.get(Customer.class, 1);
		System.out.println("Before updating database");
		System.out.println("EMP NAME : " + customer.getName());
		System.out.println("EMP DEPT : " + customer.getAddress());
	    session.close();
//	    factory.close();

	}

}
