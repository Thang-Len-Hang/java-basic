package OneToManyUniDirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Customer.class, Car.class));
	}

	public static void main(String[] args) {
		try (Session session = sessionFactory.openSession()) {

			CustomerDao obj = new CustomerDao(session);

			obj.createDb();
		}

		JPAUtil.checkData("select * from customer");
		JPAUtil.checkData("select * from car");
		JPAUtil.checkData("select * from my_customer_my_car");
	}
}