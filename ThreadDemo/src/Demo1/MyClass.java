package Demo1;

public class MyClass extends Thread {
	
	public MyClass(String name) {
		super(name);
		this.start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
