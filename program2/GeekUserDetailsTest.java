import java.util.Date; 

import org.hibernate.Session; 

public class GeekUserDetailsTest { 
	public static void main(String[] args) { 

		// open the session 
		Session session = HibernateUtil.getSessionFactory().openSession(); 

		// For doing any CRUD operation, 
		// let us start a transaction 
		session.beginTransaction(); 

		// Create an object of GeekUserDetails 
		GeekUserDetails geekUser = new GeekUserDetails(); 

		// Set all the details required 
		// to insert into the table 
		geekUser.setGeekUserId(1); 
		geekUser.setGeekUsername("GeekUser1"); 
		geekUser.setNumberOfPosts(100); 
		geekUser.setCreatedBy("GeekUser1"); 
		geekUser.setCreatedDate(new Date()); 

		// Just a save statement is enough which 
		// automatically creates an insert statement 
		session.save(geekUser); 

		// commit will help to complete 
		// the changes in the table 
		session.getTransaction().commit(); 

		// close the session 
		session.close(); 
	} 
}
