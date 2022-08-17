package StudentCrudMerge;

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

			student = session.load(Student.class, 4);
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
			
			Student s = (Student)session.merge(student);
			s.setSchool("MIU");
			s.setAge(30);
			s.setFistName("Thuzar");
			s.setLastName("Oo");

			tx.commit();
		}

	}
}