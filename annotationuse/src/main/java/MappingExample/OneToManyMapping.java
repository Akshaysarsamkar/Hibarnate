package MappingExample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMapping {
	
	public static void main(String []args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Cars c = new Cars();
		
		c.setCname("BMW");
		c.setId(1);
	
		Cars c2 = new Cars();
		
		c2.setCname("Oddi");
		c2.setId(3);
	
		Owner o = new Owner();
		
		o.setId(1);
		o.setAdds("Beed");
		o.setName("Akshay");
		
		List<Cars> cars = new ArrayList<Cars>();
		cars.add(c);
		cars.add(c2);
		
		o.setCar(cars);
		c.setOwn(o);
		c2.setOwn(o);
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		s.save(o);
		s.save(c2);
		s.save(c);
		
		t.commit();
	    
		factory.close();
	}
	

}
