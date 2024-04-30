package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Collage c = new Collage();
		c.setC_id(891);
		c.setC_name("Bjs Collage");
		c.setAdds("wagholi,pune");
		c.setTimepass(85.85f);
		
		System.out.println(c);

		session.save(c);
		t.commit();
		session.close();
		

	}
}
