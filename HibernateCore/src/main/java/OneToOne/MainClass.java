package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("java");
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("python");
		
		Vehicle v1= new Vehicle();
		v1.setVid(1);
		v1.setModel("BMW");
		
		Vehicle v2= new Vehicle();
		v2.setVid(2);
		v2.setModel("Mercedes");
		
		p1.setVehicle(v2);
		p2.setVehicle(v1);
		
		v1.setPerson(p2);
		v2.setPerson(p1);
		
		session.save(p1);
		session.save(p2);
		session.save(v1);
		session.save(v2);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
