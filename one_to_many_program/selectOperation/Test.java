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
			System.out.println("Department_id : " + d.getDept_id() + "\n" +
					"Department_name : " + d.getDept_name() + "\n" +
					"Department_location : " + d.getDept_loc() + "\n");

			Set set = d.getEmployees();

			Iterator iter = set.iterator();
			while (iter.hasNext()) {
				// System.out.println(iter.next());
				emp emps = (emp) iter.next();

				if (emps.getDept_id() == 1) {
					System.out.println(
							"Employee Department id : " +
									emps.getDept_id() + "\n" +
									"Employee id : " + emps.getEmpid() + "\n" +
									"Employee salary : " + emps.getEsal() + "\n" +
									"Employee Name : " + emps.getEmpname() + "\n");
				}

			}

			// session.save(d);
			tx.commit();

			System.out.println("Record displayed........................");

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
