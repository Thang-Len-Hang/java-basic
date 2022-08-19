package OneToOneSharePrimaryKey;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

	@Id
	private Integer id;
	private String streetName;
	private String city;
	private String zipCode;

	public Address() {

	}

	public Address(Integer id, String streetName, String city, String zipCode) {
		super();
		this.id = id;
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
	}

}
