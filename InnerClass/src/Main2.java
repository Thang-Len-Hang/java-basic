import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
			
		List<Student> students = Arrays.asList(
			new Student("John",23),	
			new Student("Thuzar",22),
			new Student("king",20),
			new Student("Khing",22)
				);
		
		Collections.sort(students); //error because there is no natural ordering 
		
		
		/***************************************************************/
		
		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		
		//Collections.sort(students,comparator);
		//Collections.sort(students,(a,b) -> a.getName().compareTo(b.getName()));
		Collections.sort(students,(a,b) -> a.getAge() - b.getAge());
		System.out.println(students);
		
		/***************************************************************/
		
		
	}

}
