package SemaphoreConsumerAndProducer;

public class Main {

	public static void main(String[] args) {
		
		Processor processor = new Processor();
		new Producer(processor);
		new Consumer(processor);
		}

}
