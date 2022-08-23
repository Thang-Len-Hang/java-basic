package CarHibernateAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "car_manufacturer")
public class CarManufacturer extends Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int numberOfEmployees;
	private int yearEstablished;
	
	@OneToMany(mappedBy = "carManufacturer")
	private List<Car> carList = new ArrayList<>();
	
	public void addCar(Car car) {
		car.setCarManufacturer(this);
		carList.add(car);
	}

	public CarManufacturer() {
		super();
	}

	public CarManufacturer(String name, String address,int numberOfEmployees, int yearEstablished) {
		super(name,address);
		this.numberOfEmployees = numberOfEmployees;
		this.yearEstablished = yearEstablished;
	}

}
