package EagerAndLazyLodding;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		/*
		Person per = new Person();
		per.setPid(2);
		per.setPname("Aksahay");
		per.setPno("9678526320");

		List<Shop> shop = new ArrayList<Shop>();

		Shop s1 = new Shop();
		s1.setAddress("pune");
		s1.setSid(1);
		s1.setSname("Mahakal general store");
		s1.setPerson(per);

		Shop s2 = new Shop();
		s2.setAddress("Mumbai");
		s2.setSid(2);
		s2.setSname("Santosh general store");
		s2.setPerson(per);

		shop.add(s2);
		shop.add(s1);

		per.setShop(shop);

		Session s = factory.openSession();

		Transaction t = s.beginTransaction();

		s.save(per);
		s.save(s1);
		s.save(s2);

		t.commit();
*/
		Session s = factory.openSession();

		
		Person p = (Person)s.get(Person.class, 2);
		System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getPno());
		
		System.out.println(p.getShop().size());
		

		s.close();
		factory.close();

	}

}
