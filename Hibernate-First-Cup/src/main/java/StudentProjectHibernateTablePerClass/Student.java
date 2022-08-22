package StudentProjectHibernateTablePerClass;

import java.time.LocalDate;
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

	@Enumerated(EnumType.STRING)
	private Gender gender;

	private LocalDate dateOfBirth;
	private String school;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Province province;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.PERSIST)
	private List<StudentSubject> studentSubjectList = new ArrayList<>();
	

	public Student() {

		
	}
	
	public void add(StudentSubject studentSubject) {
		studentSubject.setStudent(this);
		studentSubjectList.add(studentSubject);
	}

	public Student(String name, Gender gender, LocalDate dateOfBirth, String school) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.school = school;
	}

	
}
