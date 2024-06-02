package HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlUpdateDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
		SessionFactory f = cfg.buildSessionFactory();
		
		Session s = f.openSession();
		
		Transaction t = s.beginTransaction();
		
		
		String q = "update Student set sname=:n where sid=:i";

		Query query = s.createQuery(q);
		
		query.setParameter("n","AkshayKumar");
		query.setParameter("i",6);
		
        int updaterow = query.executeUpdate();
		
		System.out.println("update row " + updaterow);

		t.commit();
		s.close();
		f.close();
	}

}
