package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Teacher_student_mapping {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Teacher teacher = new Teacher();
		teacher.setTid(1);
		teacher.setDepartment("BCA");
		teacher.setTname("Patil_suvarna");

		Student stu = new Student();
		stu.setSid(1);
		stu.setSname("Akshay");
		stu.setDegree("BCA");
		stu.setTeacher(teacher);

		Student stu1 = new Student();
		stu1.setSid(2);
		stu1.setSname("Sanket");
		stu1.setDegree("BCA");
		stu1.setTeacher(teacher);

		List<Student> s = new ArrayList<Student>();
		s.add(stu1);
		s.add(stu);

		teacher.setStu(s);

		Session session = factory.openSession();

		Transaction tran = session.beginTransaction();

		session.save(teacher);
		session.save(stu1);
		session.save(stu);

		tran.commit();

		session.close();
		factory.close();

	}

}
