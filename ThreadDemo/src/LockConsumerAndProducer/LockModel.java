package LockConsumerAndProducer;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockModel {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private ArrayList<Integer> list = new ArrayList<>();
	private static final int LIMITS = 3;

	public int get() {
		int content = 0;
		try {
			lock.lock();

			for (int i = 0; i < 10; i++) {
				while (list.size() == 0) {
					condition.await();
				}

				content = list.remove(0);
				System.out.println("Consumer get :: " + content);
				condition.signal();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();

		} finally {
			lock.unlock();
		}

		return content;
	}

	public void put() {
		int value = 0;
		try {
			lock.lock();
			for (int i = 0; i < 10; i++) {
				while (list.size() == LIMITS) {
					condition.await();
				}
				list.add(value);
				System.out.println("Producer put :: " + value);
				value++;
				condition.signal();

			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {

		LockModel lockModel = new LockModel();
		Thread t1 = new Thread(() -> lockModel.put());
		Thread t2 = new Thread(lockModel::get);

		t1.start();
		t2.start();
	}
}
