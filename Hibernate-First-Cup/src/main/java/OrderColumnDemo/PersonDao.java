package OrderColumnDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDao {
	
	private Session session;

	public PersonDao(Session session) {
		super();
		this.session = session;
	}
	
	public void createDb() {
		
		Person person1 = new Person("Thaw","Thaw");
		Person person2 = new Person("John","Doe");
		
		Items items1 = new Items("Apple","fresh fruits");
		Items items2 = new Items("Orange","fresh fruits");
		Items items3 = new Items("Fish","fresh meat");
		Items items4 = new Items("chicken","fresh meat");
		
		person1.addItem(items1);
		person2.addItem(items2);
		person2.addItem(items3);
		person2.addItem(items4);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(person1);
		session.persist(person2);
		
		tx.commit();
	}
}
