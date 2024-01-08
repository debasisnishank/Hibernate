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
        // Transaction tx = null;
        System.out.println("before try");
        try {
            
            session = sf.openSession();
            // tx = session.beginTransaction();
            // student st = new student(10,"Deba","jatni",98,50);
           student st= (student) session.get(student.class,234);
           System.out.print("Student Id : " + st.getSid() +"\t" +"Student Name : " + st.getSname()
           +"\t" + "Student Address : " +st.getSaddr() +"\t"+"Student Mobile Number : " + st.getSmob());

            
            // System.out.println("Record inserted");
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
