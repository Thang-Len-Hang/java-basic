package SerializedDemo;

import java.io.Serializable;

public class Student implements Serializable {

	public static final long serialVersionUID = -1;

	private String name;
	private int age;
	private transient String school;
	private int test;
	private double fees;
	private double timeTest;
	private transient Thread t;

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getTimeTest() {
		return timeTest;
	}

	public void setTimeTest(double timeTest) {
		this.timeTest = timeTest;
	}

	public double getFees() {
		return fees;
	}

	public Student(int test) {
		super();
		this.test = test;
	}

	public Student(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [ name = " + name + ", age = " + age + ", school = " + school + " ]";
	}

}
