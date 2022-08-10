package SemaphoreDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();

		for (int i = 0; i < 12; i++) {
			executorService.execute(() -> {
				Processor.DOWNLOADER.downloadedData();
			});
			
		}
		
		executorService.shutdown();
		
	}

}
