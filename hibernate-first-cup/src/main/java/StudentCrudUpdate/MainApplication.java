package StudentCrudUpdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;
	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Student.class));

	}

	public static void main(String[] args) {

		Transaction tx = null;
		try (Session session = sessionFactory.openSession()) {
			
			Student student = session.load(Student.class, 2);
			tx = session.beginTransaction();
			
			student.setSchool("ShweBo");
			student.setAge(22);
			student.setFistName("John");
			
			
			tx.commit();
			

		} catch (Exception e) {

			e.printStackTrace();

		}finally {
			
		}

	}
}