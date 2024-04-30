package FirstProgram.com.Practic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ){
    	
        System.out.println( "Hello World!" );
             
        Configuration cfg = new Configuration();
        
        cfg.configure("Hibernate.config.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
     Session s = factory.openSession();
     
     Transaction tran = s.getTransaction();
     Emp12 e = new Emp12();
     
     e.setId(1);
     e.setAdds("ssbf");
     e.setName("FGdfg");
     
     
     
     s.save(e);
     
     tran.commit();
     
     factory.close();
     
     s.close();
     
     
        
        
        
    }
}
