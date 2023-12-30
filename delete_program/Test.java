import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

import java.io.IOException;
 public class Test{
public static void main(String[] abc)throws IOException{
	
								

									   Session session = null;
									   Transaction tx = null;
									   System.out.println("before try 4");
									   try{
										   Scanner sc = new Scanner(System.in);
										   SessionFactory sf = HibernateUtility.getSessionFactory();
										   session = sf.openSession();
										   tx = session.beginTransaction();
										   while(true){
											   System.out.println("Do you want to delete record : yes / no ");
											   String reply = sc.next();
											   
											   if("NO".equalsIgnoreCase(reply)){
												   break;
												   
											                   }
														   System.out.println("Enter the student id to delete : ");
															  int id = sc.nextInt();
															  
											         student st = (student) session.get(student.class,id);
													 if(st != null){
													 
														 System.out.println("sname : " + st.getSname());
														// st.setSname("D");
														 session.delete(st);
														System.out.println("Record delete succed"); 
														System.out.println(tx);
													      }
														  tx.commit();
														  
														 
													
												Thread.sleep(2000);	 
										   }
										   
									   }
										
										 catch(Exception e){
									   tx.rollback();
										  System.out.println(e.getMessage());
														}
															finally{
															    if(session != null){
																   session.close();
																   System.out.println("Session closed");
																					}
																}
									   
											}
 }
															
									   
									   
									   
									   