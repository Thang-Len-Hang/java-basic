package OneToOneUniDirectional;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDao {

	private Session session;
	
	public CustomerDao(Session session) {
		this.session = session;
		
	}
	
	public void createdDb() {
		Customer c1 = new Customer("John Doe",23);
		Customer c2 = new Customer("John William",22);
		Customer c3 = new Customer("Thomas King",20);
		
		Address address1 = new Address("Love Lane","Mdy");
		Address address2 = new Address("Red Bull","Ygn");
		Address address3 = new Address("Ice Lank","Sgn");
		
		//mapping
		c1.setAddress(address1);
		c2.setAddress(address2);
		c3.setAddress(address3);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(c1);
		session.persist(c2);
		session.persist(c3);
		session.persist(address1);
		session.persist(address2);
		session.persist(address3);
		
		tx.commit();
	}
}
