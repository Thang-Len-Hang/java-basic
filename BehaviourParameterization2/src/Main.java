import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = List.of(
				new Student("John Doe",23,"Latha"),
				new Student("John William",22,"ISM"),
				new Student("Richard Chen",23,"ISY"),
				new Student("Thomas Mann",24,"YIS")
				);
		
		/****************************** map *********************************/
		
		students
				.stream()
						.map(s ->{
							s.setName(s.getName().toUpperCase());
							return s;
						})
							.forEach(System.out::println);
		
		
		/****************************************************************/
		
		change(students, s -> {
			
		s.setName(s.getName().toUpperCase());
		s.setSchool("ISM");
		return s;
		}).forEach(System.out::println);
	}

	/****************************************************************/
	
	public static List<Student> change(List<Student> list,Function<Student,Student>f){
		List<Student> myList = new ArrayList<>();
		
		for(Student s: list) {
			myList.add(f.apply(s));
		}
		
		return myList;
	}

}
