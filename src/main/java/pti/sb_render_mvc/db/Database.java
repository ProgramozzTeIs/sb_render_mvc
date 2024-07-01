package pti.sb_render_mvc.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import pti.sb_render_mvc.model.User;

@Repository
public class Database {

	private SessionFactory sessionFactory;
	
	public Database() {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		sessionFactory = cfg.buildSessionFactory();
	}
	
	
	public User getUserById(int uid) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		User user = session.get(User.class, uid);
		
		tx.commit();
		session.close();
		
		
		return user;
	}
	
}

















