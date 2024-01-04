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
		// Transaction tx = null;

		try {

			// SessionFactory sf = HibernateUtility.getSessionFactory();
			session = sf.openSession();
			// tx = session.beginTransaction();
			students st = (students) session.get(students.class, 1);
			Set<courses> cs = st.getCourselist();
			for (courses c : cs) {
				System.out.print("................Student id : " + st.getSid() + "\t");
				System.out.println("course id: " + c.getCid() + "\t" + "course name : " + c.getC_name() + "\t"
						+ " course duration in hr : " + c.getC_duration());
			}
			courses ct = (courses) session.get(courses.class, 2);
			Set<students> sts = ct.getStudentlist();
			for (students ss : sts) {
				System.out.println("\nThe student are enrolled for the course:");
				System.out.println("course id : " + ct.getCid() + "\t" + "Course name : " + ct.getC_name());
				System.out.println("Student id: " + ss.getSid() + "\t" + "student name : " + ss.getSname() + "\t"
						+ "student address : " + ss.getSaddr());
			}

			System.out.println("Record displayed");

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
