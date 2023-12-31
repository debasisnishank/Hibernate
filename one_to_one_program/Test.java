import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

import java.io.IOException;
 public class Test{
public static void main(String[] abc)throws IOException{
	
								

									   Session session = null;
									   
									   try{
										   
										   SessionFactory sf = HibernateUtility.getSessionFactory();
										   session = sf.openSession();
		  
											          Employee2 emp = (Employee2) session.get(Employee2.class,1);
													  PersonalDetail pd = emp.getPersonalDetail();
													 try{
													
														 System.out.println("your Employee record is : ");
														 System.out.println("Empid : " + emp.getEmpid());
														 System.out.println("Empname : " + emp.getEmpname());
														 System.out.println("Fetching Personal Detail of Employee : ");
														 System.out.println("Employee First Name : " + pd.getFirstName()
														 + "\n" + "Employee Last Name : " + pd.getLastName() +"\n"+
														 "Location :" + pd.getLocation());
														
														
														
														 }
													      
														  catch(Exception e){
														     System.out.println(e.getMessage());
															 }
									   }
										 catch(Exception e){
										  System.out.println(e.getMessage());
														}
															finally{
															    if(session != null){
																   session.close();
																   System.out.println("Session Closed");
																					}
																}
									   
											}
 }
															
									   
									   
									   
									   