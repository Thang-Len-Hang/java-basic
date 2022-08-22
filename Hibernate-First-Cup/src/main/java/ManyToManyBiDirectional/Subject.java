package ManyToManyBiDirectional;

import java.util.*;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String duration;
	private double fees;
	
	@ManyToMany(mappedBy = "subjectList")
	private List<Student> studentList = new ArrayList<>();
	
	public Subject() {

	}

	public Subject(String name, String duration, double fees) {
		super();
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}

}
