package OneToManyBiDirList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Person.class, Items.class,ToolBox.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {

			PersonDao obj = new PersonDao(session);

			obj.createDb();

		}

		JPAUtil.checkData("select * from person");
		JPAUtil.checkData("select * from items");
		JPAUtil.checkData("select * from tool_box");
		

	}
}