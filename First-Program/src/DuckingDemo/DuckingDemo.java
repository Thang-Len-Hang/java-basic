package DuckingDemo;

public class DuckingDemo {

	public void method1() throws InterruptedException {
		Thread t = new Thread();
		t.sleep(2000);
	}

	public void method2() throws InterruptedException {
		method1();
	}

	public void method3() {
		try {
			method2();
		} catch (Exception e) {

		}
	}
}
