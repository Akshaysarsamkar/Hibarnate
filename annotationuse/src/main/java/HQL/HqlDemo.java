package HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ManyToManyMapping.Movie;
import OneToManyMapping.Student;
import PersistanceobjectLifeCycle.Parent;

public class HqlDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factoty = cfg.buildSessionFactory();

		String query = "from Parent where name=:name";
		
	

		Session s = factoty.openSession();

		Query q = s.createQuery(query);
		
		q.setParameter("name", "karan");
		
		//need to fetch single result
		
		//q.uniqueResult();
		
		//need to fetch multiple result
		List<Parent> m = q.list();
		
		for(Parent l : m ) {
		   System.out.println("Name:-" + l.getName() + ":" + " Id:-" + l.getPid() + "child name:- "+ l.getChild());
		}
		
		s.close();
		

		factoty.close();

	}

}
