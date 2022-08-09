package NoThreadSafeDemo;

public class TwoString {

	public static void printTwoString(String s1, String s2) {

		System.out.print(s1);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.print(s2);
	}
}
