package MapSeparateKeyDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Person.class, Pet.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {

			PetDao obj = new PetDao(session);

			obj.createDb();

		}

		JPAUtil.checkData("select * from person");
		JPAUtil.checkData("select * from pet");
		//JPAUtil.checkData("select * from pet_person");

	}
}