package CarHibernateAssignment;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarDao {

	private Session session;

	public CarDao(Session session) {
		super();
		this.session = session;
	}

	public void createDB() {
		
		Car car1 = new Car("Mustang","USA",1996,40000);
		Car car2 = new Car("Lexus","Japan",2022,50000);
		Car car3 = new Car("MayBench","Germany",2020,20000);
		Car car4 = new Car("Defender","USA",2020,20000);
		Car car5 = new Car("BMw","Germany",1800,70000);
		
		CarManufacturer carManufacturer1 = new CarManufacturer("Ford","Dream Land",300,1788);
		CarManufacturer carManufacturer2 = new CarManufacturer("Toyota","Love Land",500,1996);
		CarManufacturer carManufacturer3 = new CarManufacturer("Mercedes","Joy Land",100,1889);
		
		InsuranceCompany insuranceCompany1 = new InsuranceCompany("GGI", "Sule", 10);
		InsuranceCompany insuranceCompany2 = new InsuranceCompany("GAG", "Tamwe", 15);
		
		Owner owner1 = new Owner("John Doe", LocalDate.of(1996, 5, 12),"55-55-555");
		Owner owner2 = new Owner("Richard Chan", LocalDate.of(1990, 7, 10),"55-66-666");
		Owner owner3 = new Owner("Tom Yee", LocalDate.of(1998, 4, 21),"55-77-777");
		Owner owner4 = new Owner("Kyaw Yee", LocalDate.of(1992, 9, 1),"55-88-888");
		Owner owner5 = new Owner("Aung Yee", LocalDate.of(1993, 6, 10),"55-99-999");
		
		Driver driver1 = new Driver("Ma Ma", LocalDate.of(1994, 3, 21), "99-11-111");
		Driver driver2 = new Driver("Ko Ko", LocalDate.of(1992, 4, 30), "99-22-222");
		
		carManufacturer1.addCar(car1);
		carManufacturer1.addCar(car2);
		carManufacturer2.addCar(car3);
		carManufacturer2.addCar(car4);
		carManufacturer3.addCar(car5);
		
		insuranceCompany1.addCar(car1);
		insuranceCompany1.addCar(car2);
		insuranceCompany2.addCar(car3);
		
		car1.addOwner(owner1);
		car1.addOwner(owner2);
		car2.addOwner(owner3);
		car2.addOwner(owner4);
		car3.addOwner(owner5);
		car4.addOwner(owner5);
		car5.addOwner(owner5);
		
		car1.addDriver(driver1);
		car1.addDriver(driver2);
		car2.addDriver(driver2);
		car3.addDriver(driver1);
		
		Transaction tx= session.beginTransaction();
		
        session.persist(car1);
        session.persist(car2);
        session.persist(car3);
        session.persist(car4);
        session.persist(owner1);
        session.persist(owner2);
        session.persist(owner3);
        session.persist(owner4);
        session.persist(owner5);
        session.persist(driver1);
        session.persist(driver2);
       
        
        tx.commit();
		
	}
	
}
