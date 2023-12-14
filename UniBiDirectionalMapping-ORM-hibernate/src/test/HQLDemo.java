package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class HQLDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		String hql = "from NewStudent";
		Query q = s.createQuery(hql);
		List<Employee> list = (List<Employee>)q.list();
		
		for(Employee employee: list) {
			System.out.println("Id= "+employee.getId());
			System.out.println("Name= "+employee.getName());
			System.out.println("Email= "+employee.getEmail());
			System.out.println("Salary= "+employee.getSalary());
		}
		s.close();
	}
}
