import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

import java.io.IOException;

public class Test {
	public static void main(String[] abc) throws IOException {

		Session session = null;
		// Transaction tx = null;

		try {
			// Scanner sc = new Scanner(System.in);
			SessionFactory sf = HibernateUtility.getSessionFactory();
			session = sf.openSession();
			// tx = session.beginTransaction();
			emp emp1 = (emp) session.get(emp.class, 1);
			department d1 = emp1.getDepartments();
			System.out.println("empid : " + emp1.getEmpid() + "\n" + "empname : " + emp1.getEmpname() + "\n" +
					"department id : " + d1.getDept_id() + "\n" + "department name : " + d1.getDept_name());

			// emp e1 = new emp();
			// e1.setEmpid(1);
			// e1.setEmpname("deba");
			// e1.setEsal(7699.00);

			// department d1 = new department();
			// d1.setDept_id(30);
			// d1.setDept_name("HR");
			// d1.setDept_loc("bbsr");

			// e1.setDepartments(d1);

			// emp e2 = new emp();
			// e2.setEmpid(2);
			// e2.setEmpname("aman");
			// e2.setEsal(8885.99);

			// e2.setDepartments(d1);

			// session.save(e1);
			// session.save(e2);

			System.out.println("Record displayed succed");

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
