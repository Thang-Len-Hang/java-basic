package StudentProjectHibernateSingleTable;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vet_type")
public abstract class Vet{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String qualification;

	public Vet() {

	}

	public Vet(String name, String qualification) {
		super();
		this.name = name;
		this.qualification = qualification;
	}

}
