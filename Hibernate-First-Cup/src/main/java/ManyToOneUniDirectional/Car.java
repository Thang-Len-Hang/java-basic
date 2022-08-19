package ManyToOneUniDirectional;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate year;
	private String model;
	private String maker;
	
	@JoinColumn(name = "customer_id_fk")
	@ManyToOne
	private Customer customer;
	
	

	public Car() {

	}

	public Car(LocalDate year, String model, String maker) {
		super();
		this.year = year;
		this.model = model;
		this.maker = maker;
	}

}
