package CarHibernateAssignment;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;

	public Company() {

	}

	public Company(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

}
