package FinallyDemo;

public class AssertDemo {

	public static void main(String[] args) {

		int i = 5;
		try {
			assert (i > 6);
			System.out.println(i);
		} catch (Error e) {
			System.out.println(e);
		}
	}

}
