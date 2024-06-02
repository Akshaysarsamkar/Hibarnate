package HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlDeleteQueryEx {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory f = cfg.buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction t = s.beginTransaction();
		
		String query = "delete from Student where sname=:name";
		
		
		
		Query q = s.createQuery(query);
		
		q.setParameter("name","Akshay");
		
		int num = q.executeUpdate();
		
		System.out.println(num);
		
		t.commit();
		
		s.close();
		f.close();
	}

}
