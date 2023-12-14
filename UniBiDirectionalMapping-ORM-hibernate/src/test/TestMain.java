package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import beans.Laptop;
import beans.Student;

public class TestMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();   
	    Student s1 = new Student();
		s1.setRollNo(2);
		s1.setStudName("Allen");
		s1.setMarks(90);

		Laptop l1 = new Laptop();
		l1.setLid(102);
		l1.setLname("Macbook");
		l1.setStudent(s1);
		
		s1.setLaptop(l1);
	    //session.persist(l1);
	    session.persist(s1);		// 저장하는 것.
	    t.commit();
	    session.close();
	}

}
