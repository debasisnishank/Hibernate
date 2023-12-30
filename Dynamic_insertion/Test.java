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
											   System.out.println("Do you want to insert record : yes / no ");
											   String reply = sc.next();
											   
											   if("NO".equalsIgnoreCase(reply)){
												   break;
												   
											                   }
															   System.out.println("sid");
															   int id = sc.nextInt();
															   System.out.println("sname");
															   String name = sc.next();
															   System.out.println("saddr");
															   String addr = sc.next();
															   System.out.println("smob");
															   String mob = sc.next();
															   System.out.println("sfee");
															   double fee = sc.nextDouble();
											         student st = new student();
													 st.setSid(id);
									   st.setSname(name);
									   st.setSaddr(addr);
									   st.setSmob(mob);
									   st.setSfee(fee);
									   session.save(st);
													 
										   }
										   
										   

									   
									    tx.commit();
										System.out.println("Record insert succed");
										
										  }
										 catch(Exception e){
										   tx.rollback();
														}
															finally{
															    if(session != null){
																   session.close();
																   System.out.println("Done");
																					}
																}
									   
											}
															}
									   
									   
									   
									   