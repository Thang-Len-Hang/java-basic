package NoThreadSafeDemo;

public class Main {

	public static void main(String[] args) {

		new MyClass("Hello! ","Coders...");
		new MyClass("How're you doing! ","Hey!Mate ");
		new MyClass("Happy Coding "," Nice Move! ");
		
		//Race Condition	//Share State Condition	//No Thread Safe
	}

}
