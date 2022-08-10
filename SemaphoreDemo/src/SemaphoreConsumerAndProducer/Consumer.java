package SemaphoreConsumerAndProducer;

public class Consumer extends Thread {

	private Processor processor;

	public Consumer(Processor processor) {
		super();
		this.processor = processor;
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			processor.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
