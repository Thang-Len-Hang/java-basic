package CompositePrimaryKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import EmbeddedDemo.AddressInfo;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Customer.class,AddressInfo.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {

			CustomerDao obj = new CustomerDao(session);

			obj.createDb();

		}

		JPAUtil.checkData("select * from customer");
		
		

	}
}