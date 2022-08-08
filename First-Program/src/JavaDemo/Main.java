package JavaDemo;

public class Main {

	public static void main(String[] args) {

		System.out.println("Studnet Counts: " + Student.countStudentsNumber());
		Student s1 = new Student("John", 22, "IMU");
		Student s2 = new Student("Willian", 23, "UIT");
		Student s3 = new Student("Thomas", 24, "UMI");
		
		System.out.println(s3.studentInfo());
		System.out.println("Studnet Counts: " + Student.countStudentsNumber());
	}

}
