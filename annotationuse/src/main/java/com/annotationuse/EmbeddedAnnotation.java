package com.annotationuse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedAnnotation {

	public static void main(String[] args) {

       Configuration cfg = new Configuration();
       
       cfg.configure("config.xml");
       
       SessionFactory factory = cfg.buildSessionFactory();
       
       Car c = new Car();
       c.setId(2);
       c.setC_name("bmw");
       c.setColor("Black");
       
       Owner o = new  Owner();
       o.setOid(12);
       o.setOname("Akshay");
       c.setOwn(o);
       
    
       
       Session session = factory.openSession();
       
       
       Transaction tran = session.beginTransaction();
       
       session.save(c);
      
       tran.commit();
       session.close();
       factory.close();
		
	}

}
