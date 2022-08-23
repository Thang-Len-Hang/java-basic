package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student("Thaw Thaw",23));
		studentSet.add(new Student("Thaw Thaw",27));
		studentSet.add(new Student("Thaw Thaw",23));
		studentSet.add(new Student("Thaw Thaw",23));
		studentSet.add(new Student("Thaw Thaw",23));
		
		System.out.println(studentSet);
	}
}
