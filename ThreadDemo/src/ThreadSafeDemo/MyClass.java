package ThreadSafeDemo;

public class MyClass implements Runnable {

	private String s1;
	private String s2;
	
	private TwoString twoString;

	public MyClass(String s1, String s2, TwoString twoString) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.twoString = twoString;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {

		/*
		 * TwoString obj = new TwoString(); obj.printTwoString(s1, s2);
		 */
		
		//twoString.printTwoString(s1, s2);
		
		synchronized (twoString) {
			twoString.printTwoString(s1, s2);
		}
	}

}
