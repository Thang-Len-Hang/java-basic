package StudentProjectHibernateSingleTable;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student_subject")
public class StudentSubject extends idClass {
	
	private int marks;
	
	
	@ManyToOne
	private Student student;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Subject subject;

	public StudentSubject() {
		
	}
	
	public StudentSubject(int marks) {
		super();
		this.marks = marks;
	}
	
	
}
