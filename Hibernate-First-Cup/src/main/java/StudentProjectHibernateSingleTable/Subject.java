package StudentProjectHibernateSingleTable;

import java.util.ArrayList;
import java.util.List;

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

	@OneToMany(mappedBy = "subject")
	private List<StudentSubject> studentSubjectList = new ArrayList<>();

	public Subject() {

	}

	public Subject(String name, String duration, Double fees) {

		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}

	public void addStudentSubject(StudentSubject studentSubject) {

		studentSubject.setSubject(this);
		studentSubjectList.add(studentSubject);
	}

}
