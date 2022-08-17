package StudentCrudPersit;

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

			Student s1 = new Student("Ma", "Ma", 22, "IMU");
			System.out.println("1");
			session.persist(s1);
			System.out.println("2");
			s1.setFistName("Khin");
			System.out.println("3");
			s1.setLastName("Thu");
			System.out.println("4");

			// Student student1 = session.get(Student.class, 6);
			List<Student> students = session.createQuery("select s from Student s", Student.class).list();
			System.out.println("5");

			tx.commit();
			System.out.println("6");

		} 

	}
}