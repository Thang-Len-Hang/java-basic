package PrototypePattern;

public class Main {
	public static void main(String[] args) {

		Student student = new Student();
		student.setPersonId(123);
		student.setSchool("ISM");
		student.setSubject("Java");
		student.setAddress("Dream Land");
		student.setAge(23);
		student.setName("John Doe");

		Student cloneStudent = (Student) student.clone();
		Student cloneStudent2 = (Student) student.clone();
		
		System.out.println(student);
		System.out.println(cloneStudent);

		boolean test = cloneStudent.equals(cloneStudent2);
		System.out.println("student and cloneStudent are the same: " + test);
	}
}
