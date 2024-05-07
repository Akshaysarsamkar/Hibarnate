package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Third {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		First f = new First();
		f.setId(1);
		f.setName("Akshay");
		
		
		Second s = new  Second();
		s.setSid(1);
		s.setAdds("Pune");
		
		f.setSec(s);
		
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(f);
		session.save(s);
		
		t.commit();
		session.close();
		factory.close();
		
		
	}

}
