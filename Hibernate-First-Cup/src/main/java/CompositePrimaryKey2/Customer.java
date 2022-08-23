package CompositePrimaryKey2;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(AddressInfo.class)
public class Customer {

	private String firstName;
	private String lastName;

	@Column(length = 50)
	@Id
	private String streetName;

	@Column(length = 50)
	@Id
	private String zipCode;

	@Column(length = 50)
	@Id
	private String city;

	public Customer() {

	}

	public Customer(String firstName, String lastName, String streetName, String zipCode, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.city = city;

	}

}
