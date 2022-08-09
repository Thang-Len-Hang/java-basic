package InnerThreadCommunication;

public class CubbyHole {

	private int content;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		available = false;
		System.out.println("Consumer get :: " + content);
		notify();
		return content;
	}

	public synchronized void put(int data) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		available = true;
		this.content = data;
		System.out.println("Producer put :: " + data);
		notify();
	}
}
