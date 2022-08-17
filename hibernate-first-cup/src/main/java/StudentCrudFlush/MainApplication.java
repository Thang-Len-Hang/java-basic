package StudentCrudFlush;

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

			Student s1 = new Student("AA", "BB", 23, "Latha");
			Student s2 = new Student("AA", "BB", 23, "ISM");
			Student s3 = new Student("AA", "BB", 23, "ISY");

			session.persist(s1);
			session.persist(s2);
			session.persist(s3);

			tx.commit();

		}
		try (Session session = sessionFactory.openSession()) {

			tx = session.beginTransaction();

			Student s1 = session.get(Student.class, 2);
			System.out.println(s1.getFistName());
			Thread.sleep(1000);
			System.out.println("sleeps for 10 seconds...");

			s1 = session.get(Student.class, 2);
			System.out.println(s1.getFistName());

			session.refresh(s1);
			System.out.println(s1.getFistName());

			tx.commit();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}