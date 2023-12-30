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
											   System.out.println("Do you want to update record : yes / no ");
											   String reply = sc.next();
											   
											   if("NO".equalsIgnoreCase(reply)){
												   break;
												   
											                   }
															   System.out.println("sid");
															   int id = sc.nextInt();
															  
											         student st = (student) session.get(student.class,id);
													 if(st != null){
														 System.out.println("enter new your records : ");
														// System.out.println("sid : " + st.getSid());
														System.out.print("enter the student name : ");
														String name = sc.next();
														System.out.println();
														
														System.out.print("enter the student address: ");
														String addr = sc.next();
														 System.out.println();
														 
														 System.out.print("Enter the student mobile number : ");
														 String mob = sc.next();
														 System.out.println();
														 
														 System.out.print("Enter the student fees : ");
														 double fee = sc.nextDouble();
														 
														 st.setSname(name);
														 st.setSaddr(addr);
														 st.setSmob(mob);
														 st.setSfee(fee);
														
													      }
														  tx.commit();
														 System.out.println("Record updated "); 
													
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
															
									   
									   
									   
									   