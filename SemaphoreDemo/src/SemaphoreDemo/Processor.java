package SemaphoreDemo;

import java.util.concurrent.Semaphore;

public enum Processor {

	DOWNLOADER;

	private Semaphore semaphore = new Semaphore(3, true);
	

	public void downloadedData() {
		try {
			semaphore.acquire();
			download();
			//System.out.println();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}
	

	private void download() {

		try {
			System.out.println("Downloading....");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
