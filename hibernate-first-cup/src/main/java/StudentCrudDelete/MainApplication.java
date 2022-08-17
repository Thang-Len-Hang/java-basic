package StudentCrudDelete;

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

			student = session.load(Student.class, 3);
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
			// Student s1 = session.get(Student.class, 1);

			// Student s = (Student)session.merge(student);

			student.setSchool("MIU");
			student.setAge(30);
			student.setFistName("Thu Tha");
			student.setLastName("Oo");
			//session.saveOrUpdate(student);

			Student s = new Student("John", "William", 22, "Latha");
			//session.saveOrUpdate(s);

			tx.commit();
		}

		try (Session session = sessionFactory.openSession()) {

			Student s3 = (Student) session.load(Student.class, 3);
			tx = session.beginTransaction();
			session.delete(s3);
			tx.commit();
		}

	}
}