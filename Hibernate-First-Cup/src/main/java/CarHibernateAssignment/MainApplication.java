package CarHibernateAssignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import EmbeddedDemo.AddressInfo;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Car.class,CarManufacturer.class,InsuranceCompany.class,Owner.class,Driver.class,Company.class,Person.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {

			CarDao obj = new CarDao(session);

			obj.createDB();

		}

		JPAUtil.checkData("select * from car");
        JPAUtil.checkData("select * from car_manufacturer");
        JPAUtil.checkData("select * from insurance_company");
        JPAUtil.checkData("select * from car_insurance");
        JPAUtil.checkData("select * from person");
        JPAUtil.checkData("select * from owner");
        JPAUtil.checkData("select * from driver");
        JPAUtil.checkData("select * from car_owner");
        JPAUtil.checkData("select * from car_driver");
		
		

	}
}