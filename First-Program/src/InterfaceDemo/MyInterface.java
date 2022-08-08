package InterfaceDemo;

public sealed abstract interface MyInterface permits Calculator {
	double calculate(int num1, int num2); // JVM assign default public and abstract modifier
											// there is no Object
	
	public static final int NUM = 3; // only public, static and final e.g( int NUM = 3;)
	
	public default String doSomething() {
		return "My Interface do something";
	}
	
	public static String greet(String name) {  //can use static method
		return "Hello !"+ name;
	}
}
