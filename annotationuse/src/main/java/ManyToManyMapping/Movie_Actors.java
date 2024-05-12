package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Movie_Actors {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Movie m1 = new Movie();
		m1.setMid(12);
		m1.setM_name("KGF");
		m1.setBuget(52000);

		Movie m2 = new Movie();
		m2.setMid(11);
		m2.setM_name("RRR");
		m2.setBuget(59300);

		Actors a1 = new Actors();
		a1.setAid(13);
		a1.setAname("Munna");

		Actors a2 = new Actors();
		a2.setAid(3);
		a2.setAname("Khanna");

		List<Movie> movie = new ArrayList<Movie>();
		movie.add(m2);
		movie.add(m1);

		List<Actors> a = new ArrayList<Actors>();
		a.add(a2);
		a.add(a2);

		a.add(a2);
		a.add(a1);
		
		m2.setActors(a);

		a1.setMovie(movie);
		a2.setMovie(movie);

		Session s = factory.openSession();

		Transaction t = s.beginTransaction();

		s.save(a1);
		s.save(a2);
		s.save(m1);
		s.save(m2);

		t.commit();

		s.close();

		factory.close();

	}

}
