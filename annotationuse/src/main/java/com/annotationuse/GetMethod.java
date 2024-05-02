package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetMethod {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session =factory.openSession();
		
		//get method 
		
		//get method is used to fetch data from database 
		//useful when e know about the object is present is database or not if object not in database it return null value 
		
		
		Collage c = (Collage) session.get(Collage.class,9891 );
		System.out.println(c);
		
		Collage c1 = (Collage) session.get(Collage.class,9891 );
		System.out.println(c1);
		
		Address a = (Address) session.get(Address.class,1);
		System.out.println(a);
		
		//if you use object which is not in database then it return null let see 
		Address a1 = (Address) session.get(Address.class,156);
		System.out.println(a1);
		
		session.close();
		factory.close();

	}

}
