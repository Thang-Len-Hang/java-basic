package JavaServerWithFixedSizeThreadPool;

import java.io.*;
import java.net.*;

public class ExecutorsClient {

	private static int SERVER_PORT = 8100;
	private static String localhost = "127.0.0.1";

	public static void main(String[] args) {

		OutputStream outputStream = null;

		try {

			Socket socket = new Socket(localhost, SERVER_PORT);
			outputStream = socket.getOutputStream();

			System.out.println("Connection is established :: type  character and send it to enter");
			System.out.println("If you wnat to exit:: enter \"Exit\" to exit.");

			while (true) {
				byte[] data = new byte[100];
				System.in.read(data);

				String sdata = new String(data);
				if (sdata.substring(0, 4).compareTo("exit") == 0) {
					outputStream.close();
					System.exit(0);
				}

				outputStream.write(data);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
