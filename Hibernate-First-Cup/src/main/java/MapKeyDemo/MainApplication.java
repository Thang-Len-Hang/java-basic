package MapKeyDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Person.class,Pet.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {

			PetDao obj = new PetDao(session);

			obj.createDb();
			
			List<Pet> pets = session.createQuery("select p from Pet p",Pet.class).getResultList();
			pets.stream().forEach(System.out::println);
			
			Person person = session.get(Person.class, 1);
			Pet pet = person.getPetMap().get("Cathy");
			System.out.println("John Doe's Cathy Cat:: "+pet);

		}

		JPAUtil.checkData("select * from person");
		JPAUtil.checkData("select * from pet");
	

	}
}