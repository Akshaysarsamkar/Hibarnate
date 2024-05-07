package MappingExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneBidirectionalMapping {

	public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student1 s = new Student1();
		
		s.setId(1);
		s.setSname("Akshay");
		s.setCla("TYBCA");
		
		
		Certificate c = new Certificate();
		c.setId(12);
		c.setC_name("Android");
		
		c.setStu(s);
		s.setCer(c);
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
	    session.save(c);
	    session.save(s);
		
	     t.commit();	
		
	     Student1 stu1 = (Student1)session.get(Student1.class, 1);
	     
	     System.out.println(stu1.getSname());
	     System.out.println(stu1.getCer().getC_name());
	     
	     
	     
	     
	     
	     
		session.close();
		factory.close();

	}

}
