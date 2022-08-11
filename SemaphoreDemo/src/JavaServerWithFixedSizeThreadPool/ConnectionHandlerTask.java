package JavaServerWithFixedSizeThreadPool;

import java.io.*;
import java.net.*;

public class ConnectionHandlerTask implements Runnable {

	private final Socket socket;
	private final int connectionId;

	public ConnectionHandlerTask(Socket socket, int connectionId) {
		super();
		this.socket = socket;
		this.connectionId = connectionId;
	}

	@Override
	public void run() {

		System.out.println("Connected started:: " + connectionId);

		try {
			InputStream inputStream = socket.getInputStream();
			while (true) {
				byte[] data = new byte[100];
				if (inputStream.read(data) < 0) {
					break;
				}
				System.out.println("[ " + connectionId + " ]" + new String(data));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Connection:: " + connectionId + " ended.");
	}

}
