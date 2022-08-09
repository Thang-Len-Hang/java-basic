package ThreadSafeDemo;

public class Main {

	public static void main(String[] args) {
		
		TwoString obj = new TwoString();
		
		new MyClass("Hello! ","Coders...",obj);
		new MyClass("How're you  doing! ","Hey Mate! ",obj);
		new MyClass("Happy Coding! "," Nice Move! ",obj);
		
	}

}
