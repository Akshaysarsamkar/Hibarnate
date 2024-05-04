package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInfo {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Car c = (Car)session.get(Car.class, 2);
		System.out.println(c);
		System.out.println(c.getOwn().getOname());
		System.out.println(c.getC_name());
		
		
		
		session.close();
		factory.close();
		
		
		
		
	}
    

}
