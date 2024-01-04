import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtility{
public static SessionFactory sf;
static{
try{
Configuration cfg = new Configuration();
cfg.configure();
sf = cfg.buildSessionFactory();

}catch(Exception e){
System.out.println(e.getMessage());

}
}
public static SessionFactory getSessionFactory(){

if(sf != null){
System.out.println("Session Factory object returns");
return sf;
}else{
System.out.println("SessionFactory object not returned");
return null;
}


}


}
 