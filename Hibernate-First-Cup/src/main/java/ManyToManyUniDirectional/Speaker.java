package ManyToManyUniDirectional;

import java.util.*;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Speaker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String name;

	private String qualification;

	@CollectionTable(name = "speaker_experty")
	@ElementCollection
	private List<String> experties = new ArrayList<>();

	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Event> events = new ArrayList<>();

	public Speaker() {

	}

	public Speaker(String name, String qualification) {
		super();
		this.name = name;
		this.qualification = qualification;
	}

}
