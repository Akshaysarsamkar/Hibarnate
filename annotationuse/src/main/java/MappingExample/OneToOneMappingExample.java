package MappingExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMappingExample {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Answer a = new Answer();
		a.setAnsid(1);
		a.setAns("java_is_oop_language");

		Quation q = new Quation();
		q.setQuations("What_is_java?");
		q.setQuation_Id(11);
		q.setAns(a);

		Session session = factory.openSession();

		Transaction tran = session.beginTransaction();
		session.save(a);
		session.save(q);

		tran.commit();

		session.close();
		factory.close();

	}

}
