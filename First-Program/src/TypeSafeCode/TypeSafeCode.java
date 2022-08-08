package TypeSafeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

class Student {
	private String name;
	private String school;

	public Student(String name, String school) {
		super();
		this.name = name;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", school=" + school + "]";
	}

}

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

public class TypeSafeCode {
	
	public static void upperBoundTest(List<? extends B> list) {}
	public static void lowerBoundTest(List<? super B> list) {}

	public static void main(String[] args) {
		
		List<A> list = new ArrayList<>();
		
		lowerBoundTest(list);
		
		List<? extends B> list1 = new ArrayList<>(); //No Type
		List<? super B> list2 = new ArrayList<>(); //Type B
		
		list2.add(new C());
		
		ArrayList<Integer> al = new ArrayList();
		al.add(4);
		al.add(5);
		al.add(7);
		// al.add("Hello");

		// List<String> sl = List.of("Hello","Java","Is","cool");
		List<String> sl = Arrays.asList("Hello", "Java", "Is", "cool");
		List<Student> student = List.of(new Student("John Doe", "ISY"),new Student("Mg Mg", "IMU"),new Student("Kyaw Yee", "MIT"));

		// sl.set(1, "my");
		// System.out.println(sl);
		
		//Extracted(al);
		//Extracted(sl);
		//Extracted(student);
		printCollection(sl);
		//upper bound, lower bound
		
	}
	
	public static void printCollection(List<?> list) { //undefined type
		for(Object o : list) { //Only in object type that cann't be changed
			System.out.println(o);
		}
	}

	private static <T> void Extracted(List<T> al) { //type T
		java.util.Iterator<T> itr = al.iterator();
		while (itr.hasNext()) {
			T num = (T) itr.next();
			System.out.println(num);
		}
	}
}
