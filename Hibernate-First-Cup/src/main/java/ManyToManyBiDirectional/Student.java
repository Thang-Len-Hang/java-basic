package ManyToManyBiDirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;
	private String school;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Subject> subjectList = new ArrayList<>();
	
	public void addSubject(Subject subject) {
		subject.getStudentList().add(this);
		subjectList.add(subject);
}

	public Student() {

	}

	public Student(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

}
