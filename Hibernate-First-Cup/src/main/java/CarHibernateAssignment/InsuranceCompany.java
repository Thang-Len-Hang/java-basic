package CarHibernateAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "insurance_company")
public class InsuranceCompany extends Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int rating;
	
	@OneToMany(mappedBy = "insuranceCompany")
	private List<Car> carList = new ArrayList<>();

	public void addCar(Car car) {
		car.setInsuranceCompany(this);
		carList.add(car);
	}
	
	public InsuranceCompany() {
		super();
	}

	public InsuranceCompany(String name, String address,int rating) {
		super(name,address);
		this.rating = rating;
	}

}
