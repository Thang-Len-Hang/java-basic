package LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyClass2 {

	private int count = 0;

	private Lock lock = new ReentrantLock();

	// public synchronized void increase()
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
		try {
			lock.lock();
			increase();
		} finally {
			lock.unlock();
		}
	}
 
	public void secondIncrease() {
		try {
			lock.lock();
			increase();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyClass2 obj = new MyClass2();
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
