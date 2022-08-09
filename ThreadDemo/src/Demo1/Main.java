package Demo1;

public class Main {

	public static void main(String[] args) {

		MyClass obj1 = new MyClass("Thaw Thaw");
		MyClass obj2 = new MyClass("Thuzar");
		MyClass obj3 = new MyClass("John Doe");

		/*
		 * obj1.start(); obj2.start(); obj3.start();
		 */

		System.out.println("obj1 is alive? " + obj1.isAlive());
		System.out.println("obj2 is alive? " + obj2.isAlive());
		System.out.println("obj3 is alive? " + obj3.isAlive());

		try {
			obj1.join(); // death thread (return to the main method)
			obj2.join();
			obj3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("obj1 is after alive? " + obj1.isAlive());
		System.out.println("obj2 is after alive? " + obj2.isAlive());
		System.out.println("obj3 is after alive? " + obj3.isAlive());
	}

}
