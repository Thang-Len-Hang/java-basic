package JavaServerWithFixedSizeThreadPool;

import java.io.IOException;

public class Main {

	private static int PORT = 8100;
	private static int POOL_SIZE = 3;

	public static void main(String[] args) {

		System.out.println("Connection Listen....");
		ServerUsingExecutors serverUsingExecutors = null;

		try {

			serverUsingExecutors = new ServerUsingExecutors(PORT, POOL_SIZE);
			serverUsingExecutors.serviceRequest();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

