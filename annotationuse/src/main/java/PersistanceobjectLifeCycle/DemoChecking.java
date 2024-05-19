package PersistanceobjectLifeCycle;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoChecking {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Child c1 = new Child();
		c1.setAge(12);
		c1.setCid(1);
		c1.setCname("taji");
		
		Child c2 = new Child();
		c2.setAge(22);
		c2.setCid(2);
		c2.setCname("soham");
		
		Parent p = new Parent();
		
		p.setPid(1);
		p.setName("Sam");
		
		List<Child> child = new ArrayList<Child>();
		
		child.add(c2);
		child.add(c1);
		
		c1.setP(p);
		c2.setP(p);
		
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(p);
		session.save(c1);
		session.save(c1);
		
		
		//save 
		c1.setCname("Rupali");
		
		t.commit();
		c1.setCname("Raju");
		System.out.println(c1.getCname());
		session.close();
		factory.close();
		
		
	}

}
