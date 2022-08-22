package StudentProjectHibernateTablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Province.class,Student.class,Subject.class,StudentSubject.class,Vet.class,InHouseVet.class,ExHouseVet.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {

			StudentDao obj = new StudentDao(session);

			obj.createDb();

		}

		JPAUtil.checkData("select * from province");
		JPAUtil.checkData("select * from student");
		JPAUtil.checkData("select * from subject");
		JPAUtil.checkData("select * from student_subject");
		JPAUtil.checkData("select * from vet");
		JPAUtil.checkData("select * from in_house_vet");
		JPAUtil.checkData("select * from ex_house_vet");
	}
}