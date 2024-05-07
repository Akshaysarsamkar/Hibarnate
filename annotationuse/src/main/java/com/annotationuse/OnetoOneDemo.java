package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneDemo {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		
		Book b = new Book();
		
		b.setBookid(1);
		b.setBname("c++");
		b.setAuthor("Akshay");
		
		Student s = new Student();
		
		
		s.setCast("jain");
		s.setId(1);
		s.setName("sam");
		s.setBook(b);
		
		Session session = factory.openSession();
		
		
		Transaction t = session.beginTransaction();
		
		session.save(s);
		session.save(b);
		
		t.commit();
		
		
		
		session.close();
		factory.close();
	}

}
