package SingletonPattern;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		boolean test = s1.equals(s2);
		System.out.println("s1 and s2 are the same object: " + test);

		MySingleton obj1 = MySingleton.getInstance();
		MySingleton obj2 = MySingleton.getInstance();
		MySingleton obj3 = MySingleton.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		test = obj1.equals(obj2);
		System.out.println("obj1 and obj2 are the same object: " + test);
	}

}
