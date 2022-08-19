package OneToOneUniDirectional2;

import javax.persistence.*;

@Entity
public class Province {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String provinceName;
	
	@JoinColumn(name = "student_id_fk")
	@OneToOne
	private Student student;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Province() {
	}

	public Province(String provinceName) {
		this.provinceName = provinceName;
	}
}
