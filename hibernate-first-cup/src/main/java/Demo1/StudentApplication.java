package Demo1;

import java.time.LocalDate;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentApplication {
	
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Student.class));
	}
	
	public static void main(String[] args) {
		
		
		Transaction tx = null;
		
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Student s1 = new Student("John Doe",LocalDate.of(2000, 3, 27),"ISM");
			Student s2 = new Student("John William",LocalDate.of(2001, 3, 27),"ISY");
			Student s3 = new Student("Richard Chan",LocalDate.of(2002, 3, 27),"ISM");
			
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			
			tx.commit();
			
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}
}
