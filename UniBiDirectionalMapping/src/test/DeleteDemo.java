package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import beans.Employee;
import beans.Student;

public class DeleteDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t= s.beginTransaction();

		Employee e = new Employee();
		
		e.setId(101);
		s.delete(e);
		t.commit();
		s.close();
		System.out.println("Data Deleted Successfully");
	}
}
/* criteria - list(), unique()
 *where id =1; eq
 *where id>1; gt
 *where id<1; lt 
 */
