package CompositePrimaryKey;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

	private String firstName;
	private String lastName;

	@EmbeddedId
	private AddressInfo addddressInfo;

	public Customer() {

	}

	public Customer(String firstName, String lastName, AddressInfo addddressInfo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addddressInfo = addddressInfo;
	}

}
