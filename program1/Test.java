import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
 public class Test{
public static void main(String[] abc)throws IOException{
	Configuration cfg = new Configuration();
cfg.configure();
SessionFactory sf = cfg.buildSessionFactory();
								
									   //SessionFactory sf = HibernateUtility.getSessionFactory();
									   Session session = null;
									   Transaction tx = null;
									   System.out.println("before try");
									   try{
										   student st = new student();
									   session = sf.openSession();
									   tx = session.beginTransaction();  
									//   student st = new student(10,"Deba","jatni",98,50);
									   st.setSid(1);
									   st.setSname("Deba");
									   st.setSaddr("jatni");
									   st.setSmob(98);
									   st.setSfee(45);
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
									   
									   
									   
									   