package HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HqlFetchData {

	public static void main(String[] args) {
	
		Configuration cgf = new Configuration();
		
		cgf.configure("config.xml");
		
		SessionFactory f = cgf.buildSessionFactory();
		
		Session s = f.openSession();
		
		String q = "from Student";
		
		Query data = s.createQuery(q);
		
		List<Student> stu = data.list();
		
		for(Student student : stu) {
			System.out.println("Student Name is: "+student.getSname() + " doing " + student.getC().getName() + student.getId() );
//			
//			System.out.println(student.getName());
//			System.out.println(student.getCid());
			System.out.println("====================================================================");
		}
		
		
		
		f.close();
		
		

	}

}
