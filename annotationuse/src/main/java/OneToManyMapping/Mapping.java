package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {
	
	public static void main(String []args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Person p = new Person();
		p.setAge(56);
		p.setPid(1);
		p.setPname("Akshay");
		
		Laptop l = new Laptop();
		l.setLaptipname("Dell");
		l.setLaptopid(23);
		
		
		Laptop l1 = new Laptop();
		l1.setLaptipname("Lenova");
		l1.setLaptopid(203);
		
		List<Laptop> laptoplist = new ArrayList<Laptop>();
		laptoplist.add(l1);
		laptoplist.add(l);
		
		p.setLaptop(laptoplist);
		l1.setPerson(p);
		l.setPerson(p);
		
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(p);
		session.save(l1);
		session.save(l);
		
		t.commit();
		
		
		Person lt = (Person)session.get(Person.class, 1);
		
	  for (Laptop lop : lt.getLaptop()) {
		  System.out.println(lop.getLaptipname());
		  System.out.println(lop.getLaptopid());
		  System.out.println(lop.getPerson());
	  }
		
		
		
		
		session.close();
		
		factory.close();
	}

}
