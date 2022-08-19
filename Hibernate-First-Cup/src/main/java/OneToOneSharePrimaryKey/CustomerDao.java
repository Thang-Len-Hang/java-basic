package OneToOneSharePrimaryKey;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDao {
	
	private Session session;
	
	public CustomerDao(Session session) {
		this.session = session;
	}
	
	public void createDb() {
		
		Address address1 = new Address(1,"Strand Road","Ygn","11111");
		Address address2 = new Address(2,"Love Land","Sgn","22222");
		Address address3 = new Address(3,"Dream Land","Mdy","33333");
		
		Customer customer1 = new Customer();
		customer1.setName("Thaw Thaw");
		customer1.setAddress(address1);
		
		Customer customer2 = new Customer();
		customer2.setName("Maw Maw");
		customer2.setAddress(address3);
		
		
		
		Transaction tx = session.beginTransaction();
		
		session.persist(address1);
		session.persist(address2);
		session.persist(address3);
		
		session.persist(customer1);
		session.persist(customer2);
		
		tx.commit();
	}
}
