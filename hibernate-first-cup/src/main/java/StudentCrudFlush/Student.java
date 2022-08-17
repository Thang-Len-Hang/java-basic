package StudentCrudFlush;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Student {

	private Integer id;

	private String fistName;
	private String lastName;
	private int age;
	private String school;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public Student() {
		
	}


	public Student(String fistName, String lastName, int age, String school) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		this.age = age;
		this.school = school;
	}
}
