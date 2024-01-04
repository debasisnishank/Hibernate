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
			emp e1 = new emp();
			e1.setEmpid(100);
			e1.setEmpname("sayan");
			e1.setEsal(7699.00);

			department d1 = new department();
			d1.setDept_id(40);
			d1.setDept_name("MANAGER");
			d1.setDept_loc("CTC");

			e1.setDepartments(d1);

			emp e2 = new emp();
			e2.setEmpid(200);
			e2.setEmpname("anjali");
			e2.setEsal(8885.99);

			e2.setDepartments(d1);
			
			
			

			session.save(e1);
			session.save(e2);

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
