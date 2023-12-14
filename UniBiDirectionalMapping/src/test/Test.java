package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Customer;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();
	    Customer customer= new Customer();
	    customer.setId(1);
	    customer.setName("Black");
	    customer.setAddress("UK");
	    
	    session.persist(customer);
	    t.commit();
	    session.close();
//	    factory.close();
	}

}
