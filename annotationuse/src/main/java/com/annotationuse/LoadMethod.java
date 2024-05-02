package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadMethod {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		
		//load method 
		//used to fetch data from database 
		//used when sure object is present in database if onject not present the thrown ObjectNotFound Exception
		

		Collage c = (Collage) session.load(Collage.class, 9891);
		System.out.println(c);
		
		//if object not exits then thrown ObjectNotFound Exception
		Collage c1 = (Collage) session.load(Collage.class, 91);
		System.out.println(c1);

		session.close();
		factory.close();

	}

}
