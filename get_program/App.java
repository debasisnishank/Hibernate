

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
//		System.out.println(factory);
//		System.out.println("----------------");
//		System.out.println(factory.);

		// create one student object
		student st = new student();
		st.setSid(1);
									   st.setSname("Deba");
									   st.setSaddr("jatni");
									   st.setSmob(98);
									   st.setSfee(45);
									   session.save(st);
		//creating object of Adress
		//Adress ad = new Adress();
		//ad.setStreet("jatni");
		//ad.setCity("Khur");
		//ad.setOpen(true);
		//ad.setAddedDate(new Date());
		//ad.setX(45.9);
		//Reading image
		//FileInputStream fis = new FileInputStream("src/main/java/nsk/tut/Hibernate_maven/login.png");
       // byte[] dta= new byte[fis.available()];
       // fis.read(dta);
      //  ad.setImgae(dta);
//		System.out.println(st.toString());
		// capture the current session from the factory
		Session session = factory.openSession();
		// start the transcation from the session
		org.hibernate.Transaction tx = session.beginTransaction();
		// saving the object state as a row in the table
		session.save(st);
		//session.save(ad);
		// commiting the transcation
		tx.commit();
        //
		// closing the session
		session.close();
		System.out.println("done");

	}
}
