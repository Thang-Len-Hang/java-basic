package AnimalZooProject;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cageNo;
	private String location;
	
	@OneToOne(mappedBy = "cage", cascade = CascadeType.PERSIST)
	private Animal animal;

	public Cage() {
		
	}

	public Cage(String cageNo, String location) {
		super();
		this.cageNo = cageNo;
		this.location = location;
	}
	
	
}
