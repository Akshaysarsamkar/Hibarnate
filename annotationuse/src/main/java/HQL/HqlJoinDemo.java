package HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlJoinDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		
		String q = "select p.pname,p.age,l.laptipname from Person as p INNER JOIN p.laptop as l";
		
		Query query = s.createQuery(q);
		
	    List<Object []> list  = query.getResultList();
	    
	    for(Object[] arr : list) {
	    	System.out.println(Arrays.toString(arr));
	    }
	
		s.close();
		factory.close();

	}

}
