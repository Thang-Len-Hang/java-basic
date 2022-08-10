package SemaphoreConsumerAndProducer;

import java.util.concurrent.Semaphore;

public class Processor {

	private int item;
	private Semaphore conSemaphore = new Semaphore(0);
	private Semaphore proSemaphore = new Semaphore(1);

	public void get() {
		try {
			conSemaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Consumer get:: " + item);
		proSemaphore.release();
	}

	public void put(int item) {
		try {
			proSemaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		this.item = item;
		System.out.println("Producer put:: " + item);
		conSemaphore.release();
	}
}
