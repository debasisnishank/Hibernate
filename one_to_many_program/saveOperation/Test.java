import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

import java.io.IOException;

public class Test {
	public static void main(String[] abc) throws IOException {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = null;
		Transaction tx = null;

		try {
			// Scanner sc = new Scanner(System.in);
			// SessionFactory sf = HibernateUtility.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();

			// adding a single department
			department d = new department();
			d.setDept_id(1);
			d.setDept_loc("bbsr");
			d.setDept_name("Sales");
			// adding employees
			emp e1 = new emp();
			e1.setEmpid(10);
			e1.setEmpname("Debasis");
			e1.setEsal(2334.00);
			emp e2 = new emp();
			e2.setEmpid(20);
			e2.setEmpname("Susanta");
			e2.setEsal(2900.00);
			emp e3 = new emp();
			e3.setEmpid(30);
			e3.setEmpname("Sudipta");
			e3.setEsal(4599.00);

			// adding in a Set
			Set emps = new HashSet<>();
			emps.add(e1);
			emps.add(e2);
			emps.add(e3);

			d.setEmployees(emps);
			session.save(d);
			tx.commit();

			System.out.println("Record insert succed");

		} catch (Exception e) {
			// tx.rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed");
			}
		}

	}
}
