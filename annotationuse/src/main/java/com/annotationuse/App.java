package com.annotationuse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Collage c = new Collage();
		c.setC_id(9891);
		c.setC_name("Bjs Collage");
		c.setAdds("wagholi,pune");
		c.setTimepass(85.85f);

		// creating addess object class

		Address a = new Address();
		a.setStreet("street1");
		a.setCity("pune");
		a.setIsopen(true);
		a.setAdddate(new Date());
		a.setX(52.89);

		// Reading image
		FileInputStream file = new FileInputStream("src/main/java/bg.png");
		byte[] data = new byte[file.available()];
		file.read();
		a.setImage(data);

		System.out.println(c);

		session.save(c);
		session.save(a);

		t.commit();
		session.close();

		System.out.println("done");

	}
}
