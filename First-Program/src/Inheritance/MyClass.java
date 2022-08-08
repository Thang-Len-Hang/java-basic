package Inheritance;

class Person {

}

class Student extends Person {
	public void doSomething() {
		System.out.println("Do something!");
	}
}

class JavaStudent extends Student {

}

class JavaInternationalStudent extends JavaStudent {

}

public class MyClass {

	public static void main(String[] args) {
		// Person obj = new JavaInternationalStudent();
		// Person obj = new Student();
		// ((JavaInternationalStudent) obj).doSomething();

		/*
		 * boolean test = obj instanceof JavaStudent; // check type of obj
		 * System.out.println(test);
		 */

		doSomething(new JavaStudent());
	}

	public static void doSomething(Person person) {
		if (person instanceof Student) { // check obj (narrowing is not allowed)
			((Student) person).doSomething();

		} else {
			System.out.println("Wrong Object!");
		}
	}
}
