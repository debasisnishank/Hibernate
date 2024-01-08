import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import java.io.IOException;

public class Test {
    public static void main(String[] abc) throws IOException {
        
        SessionFactory sf = HibernateUtility2.getSessionFactory();
        Session session = null;
        Transaction tx = null;
        
        try {
            
            session = sf.openSession();
            tx = session.beginTransaction();
            student st = (student) session.get(student.class,234);
           
            st.setSname("Shivani Debi");
           
           
        
            

            tx.commit();
            System.out.println("Record updated......");
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
