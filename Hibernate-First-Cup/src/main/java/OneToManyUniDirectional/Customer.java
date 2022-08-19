package OneToManyUniDirectional;

import java.util.*;

import javax.persistence.*;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	
	//@JoinColumn(name = "customer_id_fk")
	
	@JoinTable(name = "my_customer_my_car",
			joinColumns = @JoinColumn(name = "customer_id_fk",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name ="car_id_fk", referencedColumnName = "id"))
	
	@OneToMany
	private List<Car> cars = new ArrayList<>();
	
	public void addCar(Car car) {
		cars.add(car);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer() {

	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
