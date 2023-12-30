import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

import java.io.IOException;
 public class Test{
public static void main(String[] abc)throws IOException{
	
								

									   Session session1,session2 = null;
									   Transaction tx = null;
									  // System.out.println("before try 4");
									   try{
										   //Scanner sc = new Scanner(System.in);
										   SessionFactory sf = HibernateUtility.getSessionFactory();
										   session1 = sf.openSession();
										   //tx = session.beginTransaction();
										  
											         student st = (student) session1.get(student.class,98);
													 if(st != null){
													// System.out.println("enter new your records : ");
														 System.out.println("student name in session 1 : " + st.getSname());
														 st.setSname("susant rajput");
														 session1.close();
														System.out.println("session 1 closed"); 
														
													      }
														 session2 = sf.openSession();
														 tx = session2.beginTransaction();
														 session2.update(st);
														 System.out.println("Student name in session 2: " + st.getSname());
														 tx.commit();
														 
													
													 
										   }
										   
							 catch(Exception e){
									   tx.rollback();
										  System.out.println(e.getMessage());
														}
															finally{
															    if(session2 != null){
																   session2.close();
																   System.out.println("session 2 closed");
																					}
																}
									   
											}
 }
															
									   
									   
									   
									   