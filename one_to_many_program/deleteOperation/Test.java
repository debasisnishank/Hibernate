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
			department d = (department) session.get(department.class, 2);
			session.delete(d);
			// session.save(d);
			tx.commit();

			System.out.println("Record deleted........................");

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
