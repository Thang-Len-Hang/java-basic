package EmbeddedDemo;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstName;
	private String lastName;

	@Embedded
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
