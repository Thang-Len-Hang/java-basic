package ManyToManyBiDirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Student.class,Subject.class));
	}

	
	
	public static void main(String[] args) {
		
		try (Session session = sessionFactory.openSession()) {

			StudentDao obj = new StudentDao(session);
			obj.createDb();
		}

		JPAUtil.checkData("select * from student");
		JPAUtil.checkData("select * from subject");
		JPAUtil.checkData("select * from student_subject");
	}
}