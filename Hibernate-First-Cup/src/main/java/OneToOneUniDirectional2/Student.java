package OneToOneUniDirectional2;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;
	private String school;
	
	
	@OneToOne(cascade = CascadeType.PERSIST,mappedBy = "student")
	private Province province;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Student() {
	}

	public Student(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public void addProvince(Province province) {
		province.setStudent(this);
		this.province = province;
	}
}
