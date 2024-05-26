package HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.annotationuse.Book;


public class HqlExample {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("config.xml");
		
       SessionFactory factory = cfg.buildSessionFactory();
       
       Session s = factory.openSession();
       
       String query = "from Book where author=:name";
       
       
       Query q = s.createQuery(query);
       q.setParameter("name", "akshay");
       
       List<Book> list = q.list();
       
       for(Book p : list) {
    	   System.out.println("BookName:-"+p.getBname() + " Book Author:-" + p.getAuthor() + " BookId:-" + p.getBookid());
       }
       
       
       
       s.close();
       factory.close();

	}

}
