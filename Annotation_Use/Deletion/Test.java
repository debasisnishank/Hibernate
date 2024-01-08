import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import java.io.IOException;

public class Test {
    public static void main(String[] abc) throws IOException {
        // AnnotationConfiguration cfg = new AnnotationConfiguration();
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = HibernateUtility2.getSessionFactory();
        Session session = null;
        Transaction tx = null;

        try {

            session = sf.openSession();
            tx = session.beginTransaction();
            student st = (student) session.get(student.class, 1);
            if (st != null) {

                System.out.println("sname : " + st.getSname());
                // st.setSname("D");
                session.delete(st);
                System.out.println("Record deleted .....");
                System.out.println(tx);
            }

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            System.out.print(e.getMessage());
        } finally {
            if (session != null) {
                session.close();
                System.out.println("Session closed");
            }
        }

    }
}
