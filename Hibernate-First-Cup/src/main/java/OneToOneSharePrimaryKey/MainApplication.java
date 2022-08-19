package OneToOneSharePrimaryKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Customer.class,Address.class));
	}

	public static void main(String[] args) {
		try (Session session = sessionFactory.openSession()) {

			CustomerDao obj = new CustomerDao(session);
			obj.createDb();
			
			Customer customer = session.get(Customer.class, 2);
			Address address = customer.getAddress();
			
			System.out.println(
					String.format("%s lived in %s.",customer.getName(),address.getCity()));
		}

		JPAUtil.checkData("select * from customer");
		JPAUtil.checkData("select * from address");
	
	}
}