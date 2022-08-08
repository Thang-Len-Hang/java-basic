package InterfaceDemo;

public final class Calculator implements MyInterface { // final or non-sealed
	public double calculate(int x, int y) { // not the same in MyInterface class if there is no public modifier

		MyInterface.greet("John");   // Type is need E.g MyInterface in static method
		System.out.println(doSomething()); // default method can be inheritance from interface with body
		
		int sealed = 5; // sealed isn't keyword
		return x + y + MyInterface.NUM;
	}
}
