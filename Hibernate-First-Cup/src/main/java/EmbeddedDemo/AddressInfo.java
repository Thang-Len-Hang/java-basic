package EmbeddedDemo;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class AddressInfo {

	private String streetName;
	private String zipCode;
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
