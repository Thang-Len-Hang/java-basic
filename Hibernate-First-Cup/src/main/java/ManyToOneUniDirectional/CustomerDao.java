package ManyToOneUniDirectional;

import java.time.LocalDate;

import org.hibernate.*;

public class CustomerDao {
	
	private Session session;

	public CustomerDao(Session session) {
		super();
		this.session = session;
	}
	
	public void createDb() {
		
		Customer c1 = new Customer("John","Doe");
		Customer c2 = new Customer("Richard","Chan");
		
		Car car1 = new Car(LocalDate.of(2005, 2, 11),"S80","Toyota");
		Car car2 = new Car(LocalDate.of(2005, 2, 11),"S22","Suzuki");
		Car car3 = new Car(LocalDate.of(2005, 2, 11),"S811","Honda");
		Car car4 = new Car(LocalDate.of(2005, 2, 11),"S826","Toyota");
		Car car5 = new Car(LocalDate.of(2005, 2, 11),"Mark 2","Toyota");  //null id in foreign key 
		
		car1.setCustomer(c1);
		car2.setCustomer(c1);
		car3.setCustomer(c2);
		car4.setCustomer(c2);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(c1);
		session.persist(c2);
		
		session.persist(car1);
		session.persist(car2);
		session.persist(car3);
		session.persist(car4);
		session.persist(car5);
		
		tx.commit();
	}
}
