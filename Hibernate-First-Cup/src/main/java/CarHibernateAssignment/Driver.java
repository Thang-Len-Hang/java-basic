package CarHibernateAssignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "driver")
public class Driver extends Person {

	private String driverNo;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinTable(name = "car_driver")
	private List<Car> carList = new ArrayList<>();

	public Driver() {
		super();
	}

	public Driver(String name, LocalDate dob, String driverNo) {
		super(name, dob);
		this.driverNo = driverNo;
	}

}
