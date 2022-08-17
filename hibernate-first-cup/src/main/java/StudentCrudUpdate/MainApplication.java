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

		Student student = null;
		Transaction tx = null;
		try (Session session = sessionFactory.openSession()) {

			student = session.load(Student.class, 5);
			tx = session.beginTransaction();
			

			student.setSchool("UIT");
			student.setAge(22);
			student.setFistName("John");
			student.setLastName("William");
			session.update(student);

			tx.commit();

		} catch (Exception e) {

			e.printStackTrace();

		}
		try (Session session = sessionFactory.openSession()) {
			tx = session.beginTransaction();
			//Student s1 = session.get(Student.class, 1);

			student.setSchool("CUM");
			student.setAge(30);
			student.setFistName("Thuzar Lwin");
			student.setLastName("Oo");
			session.update(student);

			tx.commit();
		}

	}
}