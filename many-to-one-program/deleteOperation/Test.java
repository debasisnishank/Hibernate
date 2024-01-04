import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

import java.io.IOException;

public class Test {
	public static void main(String[] abc) throws IOException {

		Session session = null;
		Transaction tx = null;

		try {
			// Scanner sc = new Scanner(System.in);
			SessionFactory sf = HibernateUtility.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			emp emp1 = (emp) session.get(emp.class, 1);
			emp emp2 = (emp) session.get(emp.class, 2);
			department d1 = emp1.getDepartments();
			department d2 = emp1.getDepartments();

			System.out.println(d1.getDept_id() + "\t" + d1.getDept_name());
			session.delete(d1);
			session.delete(d2);
			session.delete(emp1);
			session.delete(emp2);
			
			tx.commit();
			System.out.println("Record deleted succed");

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
