package MapKeyDemo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy = "person",cascade = CascadeType.PERSIST)
	@MapKey(name = "name")
	private Map<String, Pet> petMap = new HashMap<>();
	
	
	public void addPet(String name, Pet pet) {
		pet.setPerson(this);
		petMap.put(name, pet);
	}
	
	public Person() {
		
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
