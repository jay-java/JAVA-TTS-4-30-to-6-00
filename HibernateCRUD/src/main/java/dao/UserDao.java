package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	public static void insertUser(User u) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction trx = session.beginTransaction();
		session.save(u);
		trx.commit();
		session.close();
		sf.close();
	}
}
