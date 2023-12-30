import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
 public class Test{
public static void main(String[] abc)throws IOException{
	
								
									   SessionFactory sf = HibernateUtility.getSessionFactory();
									   Session session = null;
									   Transaction tx = null;
									   System.out.println("before try 4");
									   try{
										   student st = new student();
									   session = sf.openSession();
									   tx = session.beginTransaction();  
									//   student st = new student(10,"Deba","jatni",98,50);
									   st.setSid(3);
									   st.setSname("susant");
									   st.setSaddr("khordha");
									   st.setSmob("9897763567");
									   st.setSfee(8700.00);
									   session.save(st);
									   
									    tx.commit();
										
										  }
										 catch(Exception e){
										   //tx.rollback();
														}
															finally{
															    if(session != null){
																   session.close();
																   System.out.println("Done");
																					}
																}
									   
											}
															}
									   
									   
									   
									   