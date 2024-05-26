package HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import EagerAndLazyLodding.Person;

public class HqlDemoEx {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		String q = "from Person where pid > 2";
		
		Query qu = s.createQuery(q);
		
		List<Person> list = qu.list();
		
		for(Person p : list) {
			System.out.println("==========================================");
			System.out.println(p.getPname());
			System.out.println(p.getPno());
			System.out.println(p.getPid());
			System.out.println("==========================================");

		}

		s.close();
		factory.close();

	}

}
