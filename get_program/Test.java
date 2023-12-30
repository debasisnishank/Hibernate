import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

import java.io.IOException;
 public class Test{
public static void main(String[] abc)throws IOException{
	
								

									   Session session = null;
									   //Transaction tx = null;
									   System.out.println("before try 4");
									   try{
										   Scanner sc = new Scanner(System.in);
										   SessionFactory sf = HibernateUtility.getSessionFactory();
										   session = sf.openSession();
										   //tx = session.beginTransaction();
										   while(true){
											   System.out.println("Do you want to get record : yes / no ");
											   String reply = sc.next();
											   
											   if("NO".equalsIgnoreCase(reply)){
												   break;
												   
											                   }
															   System.out.println("sid");
															   int id = sc.nextInt();
															  
											         student st = (student) session.get(student.class,id);
													 if(st != null){
														 System.out.println("your record is : ");
														 System.out.println("sid : " + st.getSid());
														 System.out.println("sname : " + st.getSname());
														 System.out.println("saddr : " + st.getSaddr());
														 System.out.println("smob : " + st.getSmob());
														 System.out.println("sfee : " + st.getSfee());
														 
													      }else{   
														  System.out.println("Record doesnot exist");
														  }
													
													 
										   }
										   
										   

									   
									    
										//System.out.println("Record insert succed");
										
										  }
										 catch(Exception e){
										  // tx.rollback();
														}
															finally{
															    if(session != null){
																   session.close();
																   System.out.println("Done");
																					}
																}
									   
											}
															}
									   
									   
									   
									   