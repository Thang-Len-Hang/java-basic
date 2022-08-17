package StudentCrudRefresh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
	private static SessionFactory sessionFactory;
	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Student.class));

	}

	public static void main(String[] args) {

		Student student = null;
		Transaction tx = null;
		try (Session session = sessionFactory.openSession()) {

			tx = session.beginTransaction();
			
			Student s1 = new Student("AA","BB",23,"Latha");
			Student s2 = new Student("AA","BB",23,"ISM");
			Student s3 = new Student("AA","BB",23,"ISY");
			
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			
			s1.setFistName("Thuza");
			s1.setLastName("Nwe");
			
			s2.setFistName("Khaing");
			s2.setLastName("Thuza");
			
			session.delete(s2);
			
			System.out.println("about to flush()");
			session.flush();
			System.out.println("after flush()");
			
			tx.commit();
			

		} 

	}
}