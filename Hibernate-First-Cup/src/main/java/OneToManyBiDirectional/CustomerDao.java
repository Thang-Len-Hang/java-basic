package OneToManyBiDirectional;

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
		Car car5 = new Car(LocalDate.of(2005, 2, 11),"Mark 2","Toyota"); 
		Car car6 = new Car(LocalDate.of(2005, 2, 11),"Crown","Toyota");
		Car car7 = new Car(LocalDate.of(2005, 2, 11),"LandCruiser","Toyota");
		
		/*
		 * c1.getCars().add(car1); car1.setCustomer(c1);
		 */
		c1.addCar(car1);
		c1.addCar(car2);
		c1.addCar(car3);
		c2.addCar(car4);
		c2.addCar(car5);
		c2.addCar(car6);
		c2.addCar(car7);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(c1);
		session.persist(c2);
		
		
		tx.commit();
	}
}
