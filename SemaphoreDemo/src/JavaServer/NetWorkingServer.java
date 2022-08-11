package JavaServer;

import java.io.*;
import java.net.*;

public class NetWorkingServer {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket;
		int portNumber = 1234;

		try {
			serverSocket = new ServerSocket(portNumber);

		} catch (IOException e) {
			System.out.println("Cannot create ServerSocket with port:: " + portNumber);
			System.exit(1);
		}

		System.out.println("ServerSocket is created:: " + serverSocket);

		while (true) {

			try {
				System.out.println("Waiting for request...");
				socket = serverSocket.accept();

				System.out.println("Connection request is accepted.");
				String host = socket.getInetAddress().getHostAddress();
				int port = socket.getPort();
				System.out.println("Client port:: " + port + " :: " + " Client host:: " + host);

				InputStream inputStream = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
				String clientMsg = br.readLine();
				System.out.println("Message from Client: " + clientMsg);

				if (clientMsg != null && clientMsg.equalsIgnoreCase("bye")) {
					OutputStream outputStream = socket.getOutputStream();
					PrintWriter pw = new PrintWriter(outputStream, true);
					String serverMsg = "Hello, " + clientMsg;
					pw.println(serverMsg);
				}

				// closing socket
				if (clientMsg != null && clientMsg.equalsIgnoreCase("bye")) {
					serverSocket.close();
					socket.close();
					break;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
