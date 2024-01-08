import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import java.io.IOException;

public class Test {
    public static void main(String[] abc) throws IOException {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

        // SessionFactory sf = HibernateUtility.getSessionFactory();
        Session session = null;
        Transaction tx = null;
        System.out.println("before try");
        try {
            student st = new student();
            session = sf.openSession();
            tx = session.beginTransaction();
            // student st = new student(10,"Deba","jatni",98,50);
            st.setSid(234);
            st.setSname("Shivani");
            st.setSaddr("Balasore");
            st.setSmob("7848059574");
            st.setSfee(4599.00);
            session.save(st);

            tx.commit();
            System.out.println("Record inserted");
        } catch (Exception e) {
            // tx.rollback();
            System.out.print(e.getMessage());
        } finally {
            if (session != null) {
                session.close();
                System.out.println("Done");
            }
        }

    }
}
