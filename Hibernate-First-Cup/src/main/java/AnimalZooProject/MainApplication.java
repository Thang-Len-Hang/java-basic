package AnimalZooProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Cage.class,Category.class,Animal.class,Supplier.class,FoodItem.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {
			
			ZooDao obj = new ZooDao(session);
			
			obj.createDb();
			
		}

		JPAUtil.checkData("select * from cage");
		JPAUtil.checkData("select * from category");
		JPAUtil.checkData("select * from animal");
		JPAUtil.checkData("select * from supplier");
		JPAUtil.checkData("select * from food_item");
		JPAUtil.checkData("select * from animal_food_item");

	}
}