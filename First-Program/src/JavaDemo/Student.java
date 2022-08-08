package JavaDemo;

public class Student {
	String name;
	int age;
	String school;

	static int count;

	public Student(String name, int age, String school) {

		this.name = name;
		this.age = age;
		this.school = school;
		count++;
	}

	public String studentInfo() {
		return String.format("Name:[%s] :: Age:[%s] :: School: [%s]", name, age, school);
	}

	public static int countStudentsNumber() {
		return count;
	}
}
