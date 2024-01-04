import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

import java.io.IOException;

public class Test {
	public static void main(String[] abc) throws IOException {
		// Configuration cfg = new Configuration();
		// cfg.configure();
		// SessionFactory sf = cfg.buildSessionFactory();
		Session session = null;
		Transaction tx = null;

		try {
			// Scanner sc = new Scanner(System.in);
			SessionFactory sf = HibernateUtility.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			department d = (department) session.get(department.class, 1);
			d.setDept_name("Sales_dept");
			d.setDept_loc("bhubaneswar");

			Set set = d.getEmployees();

			Iterator iter = set.iterator();
			while (iter.hasNext()) {
				// System.out.println(iter.next());
				emp emps = (emp) iter.next();
				System.out.println(
						emps.getDept_id() + " " + emps.getEmpid() + " " + emps.getEsal() + " " + emps.getEmpname());
				if (emps.getEmpid() == 20) {
					emps.setEmpname("susant_debata");
					emps.setEsal(88884.09);
					System.out.println("Child record updated");
				}

			}

			// session.save(d);
			tx.commit();

			System.out.println("Record update succed");

		} catch (Exception e) {
			tx.rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed");
			}
		}

	}
}
