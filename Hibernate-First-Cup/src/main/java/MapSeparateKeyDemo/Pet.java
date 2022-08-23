package MapSeparateKeyDemo;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String species;
	private String race;
	
	//@JoinTable(name = "pet_person")
	@ManyToOne
	private Person person;
	
	public Pet() {

	}

	public Pet(String name, String species, String race) {
		super();
		this.name = name;
		this.species = species;
		this.race = race;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", species=" + species + ", race=" + race + "]";
	}
	
	

}
