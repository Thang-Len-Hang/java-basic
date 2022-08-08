import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


class Student{
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
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Main {

	public static int sum(List<Integer> list) {
		int sum = 0;
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}

	/********************************Using Stream API****************************************/
	
	public static int sumStream(List<Integer> list) {
		 list.stream()
				.filter(a -> {
					System.out.println("Filter "+a);
				return a > 10;
				})
				.mapToInt(i -> {
					System.out.println("MapToInt "+i);
					return i;
				})
				;
		return 0;
	}
	
	/************************************************************************/

	public static void main(String[] args) {
		//int result = sum(List.of(7, 8, 9, 10, 11, 12, 13));
		/*
		 * int result = sumStream(List.of(7, 8, 9, 10, 11, 12, 13));
		 * System.out.println(result);
		 */
		
		
	/************************************************************************/	
		Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9);
		
		intStream
			.filter(i -> i % 2 == 0)
			.map(a -> a * a)
			.limit(3)
			.forEach(a -> System.out.println(a+ " "));
		
		
		/*
		 * intStream .forEach(System.out::println);
		 */
		
		
		List.of(
				new Student ("Kyaw", 22),
				new Student ("Oo", 20),
				new Student ("Mg Mg", 23),
				new Student ("Ma Ma", 20)
				).stream()
							.map(Student::getName)
							.filter(s -> s.startsWith("M"))
							.map(String::toUpperCase)
							.forEach(System.out::println);
	}

}
