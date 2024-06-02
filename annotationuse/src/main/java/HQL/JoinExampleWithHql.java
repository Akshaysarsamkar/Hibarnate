package HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class JoinExampleWithHql {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		String query = "select q.qua,q.Quation_Id,a.ans from Quation as q INNER JOIN q.answer as a";
		
		Query q = s.createQuery(query);
		
		List<Object []> list = q.getResultList();
		
		for(Object [] l : list) {
			System.out.println(Arrays.toString(l));
		}
		
		s.close();
		factory.close();
		
	}

}
