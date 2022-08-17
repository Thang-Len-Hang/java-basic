package StudentCrud;

import StudentCrud.Student;
import StudentCrud.StudentDAO;
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

		try (Session session = sessionFactory.openSession()) {

			StudentDAO obj = new StudentDAO(session);
			obj.create(new Student("John Doe", 22, "ISM"));
			obj.create(new Student("John William", 23, "ISY"));
			obj.create(new Student("Thuza Nwe", 20, "ISM"));
			obj.create(new Student("Khaing", 20, "ISM"));
			obj.create(new Student("Thaw", 20, "ISM"));

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}