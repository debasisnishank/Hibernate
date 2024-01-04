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

			// SessionFactory sf = HibernateUtility.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();

			courses s1 = new courses();
			// s1.setCid(200);
			s1.setC_duration(8);
			s1.setC_name("telugu");

			courses s2 = new courses();
			// s1.setCid(200);
			s2.setC_duration(34);
			s2.setC_name("malayalam");

			// adding set of courses
			Set cset = new HashSet<>();
			Set csett2 = new HashSet<>();

			csett2.add(s1);
			csett2.add(s2);
			students nx = new students("alisa", "newyork", csett2);
			students nx2 = new students("shinchan", "tokio", csett2);
			students nx3 = new students("nibi", "mirzaour", csett2);
			students nx4 = new students("jian", "nepal", csett2);

			cset.add(nx);
			cset.add(nx2);
			cset.add(nx3);
			cset.add(nx4);
			courses cr1 = new courses(
					"urdu", 10, cset);

			session.save(cr1);

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
