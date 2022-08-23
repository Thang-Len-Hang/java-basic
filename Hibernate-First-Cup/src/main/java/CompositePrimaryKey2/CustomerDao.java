package CompositePrimaryKey2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDao {
	
	private Session session;

	public CustomerDao(Session session) {
		super();
		this.session = session;
	}
	
	public void createDb() {
		Customer c1 = new Customer("John","Doe","Dream Land","555555","YGN");
		Customer c2 = new Customer("John","William","Love Land","666666","MDY");
		Customer c3 = new Customer("John","Doe","72 Park Avenue","333333","SGN");
		Customer c4 = new Customer("Thomas","Harry","72 Park gvh","3124134","POL");
		
		Transaction tx = session.beginTransaction();
		
		session.persist(c1);
		session.persist(c2);
		session.persist(c3);
		session.persist(c4);
		
		tx.commit();
	}
}
