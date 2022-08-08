package SwitchDemo;

public class SwitchDemo {

	public static void main(String[] args) {

		int num = 3;
		
		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Bogus num");
		}
	}
}
