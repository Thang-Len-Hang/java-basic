package CarHibernateAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String model;
	private String make;
	private int year;
	private int millage;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private CarManufacturer carManufacturer;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinTable(name = "car_insurance")
	private InsuranceCompany insuranceCompany;

	@OneToMany(mappedBy = "carList")
	private List<Owner> ownerList = new ArrayList<>();

	@OneToMany(mappedBy = "carList")
	private List<Driver> driverList = new ArrayList<>();

	public void addOwner(Owner owner) {
		owner.setCarList(this);;
		ownerList.add(owner);
	}

	public void addDriver(Driver driver) {
		driver.setCarList(this);
		driverList.add(driver);
	}

	public Car() {

	}

	public Car(String model, String make, int year, int millage) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.millage = millage;
	}

}
