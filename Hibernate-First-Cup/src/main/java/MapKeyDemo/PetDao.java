package MapKeyDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PetDao {
	
	private Session session;

	public PetDao(Session session) {
		super();
		this.session = session;
	}
	
	public void createDb() {
		
		Person person1 = new Person("John","Doe");
		Person person2 = new Person("John","William");
		
		Pet pet1 = new Pet("Tracy","Cat","Africa");
		Pet pet2 = new Pet("Cathy","Cat","India");
		Pet pet3 = new Pet("Zeus","Dog","Myanmar");
		Pet pet4 = new Pet("Hercules","Dog","India");
		
		//person1.getPetMap().put(pet1.getName(), pet1);
		person1.addPet(pet1.getName(), pet1);
		person1.addPet(pet2.getName(), pet2);
		
		person2.addPet(pet3.getName(), pet3);
		person2.addPet(pet4.getName(), pet4);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(person1);
		session.persist(person2);
		
		tx.commit();
	}
}
