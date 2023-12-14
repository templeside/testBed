package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import beans.Employee;
import beans.Student;

public class SelectWithProjection {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Employee user = null;
		try {
			Criteria crit = session.createCriteria(Employee.class);
			ProjectionList prolist = Projections.projectionList();
			prolist.add(Projections.max("salary"));
			prolist.add(Projections.min("salary"));
			prolist.add(Projections.avg("salary"));
			crit.setProjection(prolist);
			List list = crit.list();
			Iterator itr = list.iterator();
			if(!itr.hasNext()) {
				System.out.println("No Data Available!");
			}else {
				while(itr.hasNext()) {
					System.out.printf("\n");
					
					Object[] row = (Object[]) itr.next();
					for(int i=0; i<row.length; i++) {
						if(i==0) {
							System.out.print("Max Salary is: ");
							System.out.print(row[i]);
							System.out.printf("\n");
						}if(i==1) {
							System.out.print("Min Salary is: ");
							System.out.print(row[i]);
							System.out.printf("\n");
						}if(i==2) {
							System.out.print("average Salary is (): ");
							System.out.print(row[i]);
							System.out.printf("\n");
						}
					}
				}
			}
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
/* criteria - list(), unique()
 *where id =1; eq
 *where id>1; gt
 *where id<1; lt 
 */
