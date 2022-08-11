package JavaServerWithFixedSizeThreadPool;

import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerUsingExecutors {

	private final ServerSocket serverSocket;
	private final ExecutorService executorService;

	public ServerUsingExecutors(int port, int poolSize) throws IOException {
		serverSocket = new ServerSocket(port);
		executorService = Executors.newFixedThreadPool(poolSize);
	}

	public void serviceRequest() {
		int count = 1;
		try {

			while (true) {
				executorService.execute(new ConnectionHandlerTask(serverSocket.accept(), count++));
			}

		} catch (IOException e) {
			e.printStackTrace();
			executorService.shutdown();
		}
	}

}
