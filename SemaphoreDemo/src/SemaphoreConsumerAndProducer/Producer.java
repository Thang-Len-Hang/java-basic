package SemaphoreConsumerAndProducer;

public class Producer extends Thread {

	private Processor processor;

	public Producer(Processor processor) {
		super();
		this.processor = processor;
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			processor.put(i);
		}
	}
}
