package StudentCrud;


import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainApplication {
	
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList());
	}
	
	public static void main(String[] args) {
		
		
		Transaction tx = null;
		
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			
			
			tx.commit();
			
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}
}
