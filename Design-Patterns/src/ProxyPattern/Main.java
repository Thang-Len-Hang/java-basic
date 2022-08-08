package ProxyPattern;

public class Main {

	public static void main(String[] args) {
		
		IGreeting greeting = new VerboseGreetingProxy(new FormalGreeting());
		System.out.println(greeting.greet(" Hnin "));
	}

}
