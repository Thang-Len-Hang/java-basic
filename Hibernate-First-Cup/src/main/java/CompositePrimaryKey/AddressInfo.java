package CompositePrimaryKey;

import java.io.Serializable;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class AddressInfo implements Serializable{
	
	@Column(length = 50)
	private String streetName;
	
	@Column(length = 50)
	private String zipCode;

	@Column(length = 50)
	private String city;

	public AddressInfo() {

	}

	public AddressInfo(String streetName, String zipCode, String city) {
		super();
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.city = city;
	}

}
