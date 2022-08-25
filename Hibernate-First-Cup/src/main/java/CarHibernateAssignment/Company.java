package CarHibernateAssignment;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
