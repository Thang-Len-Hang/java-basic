package OneToOneUniDirectional2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;
	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Student.class, Province.class));
	}

	public static void main(String[] args) {
		try (Session session = sessionFactory.openSession()) {
			StudentDao obj = new StudentDao(session);
			obj.createDb();
			Student student = session.load(Student.class, 1);
			Province province = session.load(Province.class, 2);
			
			System.out.println(
					String.format("%s is lived in %s.", student.getName(), student.getProvince().getProvinceName()));
			System.out.println(
					String.format("%s is lived in %s.", province.getStudent().getName(), province.getProvinceName()));
		}

		JPAUtil.checkData("select * from student");
		JPAUtil.checkData("select * from province");
	}
}