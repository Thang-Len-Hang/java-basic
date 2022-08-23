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
@Table(name = "owner")
public class Owner extends Person {

	private String ownerNo;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinTable(name = "car_owner")
	private List<Car> carList = new ArrayList<>();

	public Owner() {
		super();
	}

	public Owner(String name, LocalDate dob, String ownerNo) {
		super(name, dob);
		this.ownerNo = ownerNo;
	}

}
