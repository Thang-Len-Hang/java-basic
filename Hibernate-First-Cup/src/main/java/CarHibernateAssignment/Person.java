package CarHibernateAssignment;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private LocalDate dob;

	public Person() {

	}

	public Person(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

}
