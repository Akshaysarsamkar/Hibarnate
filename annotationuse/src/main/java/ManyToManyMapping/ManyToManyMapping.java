package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMapping {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		// first project
		Project project = new Project();
		project.setProject_id(1);
		project.setProject_Name("HR Management");

		// Second project
		Project project1 = new Project();
		project1.setProject_id(2);
		project1.setProject_Name("Library management system");

		// third project
		Project project2 = new Project();
		project2.setProject_id(3);
		project2.setProject_Name("ChatBoot");

		// First person
		Person person = new Person();
		person.setPerson_id(1);
		person.setPerson_Name("Akshay");

		// Second person
		Person person1 = new Person();
		person1.setPerson_id(2);
		person1.setPerson_Name("Karan");

		// third person
		Person person2 = new Person();
		person2.setPerson_id(3);
		person2.setPerson_Name("Pradip");

		List<Person> p1 = new ArrayList<Person>();
		p1.add(person2);
		p1.add(person);
		project.setPerson(p1);

		List<Project> pro = new ArrayList<Project>();
		pro.add(project2);
		pro.add(project1);

		person.setProject(pro);

		Session s = factory.openSession();

		Transaction t = s.beginTransaction();

		s.save(person);
		s.save(person1);
		s.save(person2);

		s.save(project);
		s.save(project1);
		s.save(project2);

		t.commit();

		factory.close();

	}

}
