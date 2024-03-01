package OneToManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Seller s1  = new Seller();
		s1.setSid(1);
		s1.setName("java");
		
		Seller s2  = new Seller();
		s2.setSid(2);
		s2.setName("python");
		
		Product p1 = new Product();
		p1.setPid(1);
		p1.setPname("mobile");
		
		Product p2 = new Product();
		p2.setPid(2);
		p2.setPname("bag");
		
		Product p3 = new Product();
		p3.setPid(3);
		p3.setPname("chair");
		
		Product p4 = new Product();
		p4.setPid(4);
		p4.setPname("tv");
		
		List<Product> plist1 = new ArrayList<Product>();
		plist1.add(p1);
		plist1.add(p2);

		List<Product> plist2 = new ArrayList<Product>();
		plist2.add(p3);
		plist2.add(p4);
		
		s1.setProducts(plist1);
		s2.setProducts(plist2);
		
		p1.setSeller(s1);
		p2.setSeller(s1);
		p3.setSeller(s2);
		p4.setSeller(s2);
		
		session.save(s1);
		session.save(s2);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		tx.commit();
		session.close();
		sf.close();
	}
}
