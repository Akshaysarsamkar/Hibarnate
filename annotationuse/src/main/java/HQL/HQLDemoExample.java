package HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDemoExample {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("config.xml");

		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();

	
//		Student stu = new Student();
//		stu.setId(6);
//		stu.setSclass("TYBCA");
//		stu.setSname("abhi");		
//		Certificate c = new Certificate();		
//		c.setCid(6);
//		c.setName("Android");		
//		stu.setC(c);
//		c.setS(stu);
//		Transaction t = s.beginTransaction();		
//		s.save(c);
//		s.save(stu);		
//		t.commit();
		
		String que = "from Student where sname=:name";
		Query q = s.createQuery(que);
		
		q.setParameter("name", "Akshay");
		
		List<Student> stu = q.list();
		
		for(Student s1 : stu) {
			System.out.println(s1.getSname() + " : " + s1.getC().getName() + " : " + s1.getSclass());
		}

		s.close();
		f.close();

	}

}
