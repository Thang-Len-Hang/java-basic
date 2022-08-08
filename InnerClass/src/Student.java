
import java.lang.Comparable;

public class Student implements Comparable {

	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object student) {
		// TODO Auto-generated method stub
		return this.age - ((Student)student).age;
	}

}
