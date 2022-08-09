package LockDemo;

public class MyClass {

	private int count = 0;

	public void increase() {
		for (int i = 0; i < 10000; i++) {
			count++;
			/*
			 * try { Thread.sleep(500); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}
	}

	public void finish() {
		System.out.println(count);
	}

	public void firstIncrease() {
		increase();
	}

	public void secondIncrease() {
		increase();
	}

	public static void main(String[] args) throws InterruptedException {
		MyClass obj = new MyClass();
		Runnable r1 = () -> obj.firstIncrease();
		Runnable r2 = obj::secondIncrease;

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		obj.finish();

	}
}
