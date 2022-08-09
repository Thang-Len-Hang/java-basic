package ThreadSafeDemo;

public class TwoString {

	//public synchronized static void printTwoString(String s1, String s2) {
		//public synchronized void printTwoString(String s1, String s2) {
	public void printTwoString(String s1, String s2) {

		System.out.print(s1);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(s2);
	}
}
