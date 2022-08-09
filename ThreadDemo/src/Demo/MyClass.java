package Demo;

public class MyClass implements Runnable {

	public MyClass(String name) {
		Thread t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
