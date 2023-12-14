package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;
import beans.Student;

public class SelectUsingRestriction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Employee.class);
		Criterion cr = Restrictions.eq("id", "1");
		c.add(cr);
		Employee emp = (Employee) c.uniqueResult();
		System.out.println(emp.getName()+","+emp.getEmail());
	}
}
/* criteria - list(), unique()
 *where id =1; eq
 *where id>1; gt
 *where id<1; lt 
 */
