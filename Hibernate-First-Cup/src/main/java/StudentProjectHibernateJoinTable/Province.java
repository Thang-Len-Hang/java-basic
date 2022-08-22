package StudentProjectHibernateJoinTable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Province {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String provinceName;
	
	@OneToMany(mappedBy = "province")
	private List<Student> studentList = new ArrayList<>();
	
	public void addStudent(Student student) {
		student.setProvince(this);
		studentList.add(student);
	}
	
	public Province(String provinceName) {
		super();
		this.provinceName = provinceName;
	}
	
	
	
}
