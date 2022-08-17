package StudentCrudSaveAndPersist;

import StudentCrudSaveAndPersist.Student;
import StudentCrudSaveAndPersist.StudentDAO;
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

			StudentDAO obj = new StudentDAO(session);
			/*
			 * int id = obj.save(new Student("John"," Doe", 22, "ISM"));
			 * System.out.println("John Doe: "+id); int id1 = obj.save(new
			 * Student("John"," William", 23, "ISY"));
			 * System.out.println("John William: "+id1); int id2 = obj.save(new
			 * Student("Thuza"," Nwe", 20, "ISM")); System.out.println("Thuza Nwe: "+id2);
			 * int id3 = obj.save(new Student("Khaing","Thuzar", 20, "ISM"));
			 * System.out.println("Khaing Thuzar: "+id3); int id4 = obj.save(new
			 * Student("Thaw","Thar", 20, "ISM")); System.out.println("Thaw Thar: "+id4);
			 */
			
			Student s1 = new Student("John","Doe",23,"ISY");
			Student s2 = new Student("John"," William", 23, "ISY");
			
			tx = session.beginTransaction();
			
			int id = (Integer) session.save(s1);
			System.out.println("John Doe: "+id);
			
			id = (Integer) session.save(s2);
			System.out.println("John William: "+id);
			
			/*
			 * Student student = session.get(Student.class, 5);
			 * System.out.println(student.getName());
			 */
			
			Student student = session.load(Student.class, 2);
			System.out.println(student.getName());
	
			
			tx.commit();
			

		} catch (Exception e) {

			e.printStackTrace();

		}finally {
			
		}

	}
}