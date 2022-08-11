package JavaServer;

import java.io.*;
import java.net.*;

public class NetworkingClient {

	public static void main(String[] args) {

		Socket client = null;
		int port = 1234;

		for (int i = 0; i < 10; i++) {
			try {
				String msg = "";
				client = new Socket(InetAddress.getLocalHost(), port);
				System.out.println("Client is created with host:: " + client.getLocalAddress() + " " + " port:: "
						+ client.getPort());

				// create outputstream for socket
				OutputStream outputStream = client.getOutputStream();
				PrintWriter pw = new PrintWriter(outputStream, true);

				// create inputstream for socket
				InputStream inputStream = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

				// Std InputStream
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter your name:: \"Bye\" to exit:: ");
				msg = in.readLine();
				pw.println(msg);

				System.out.println("Respond Message from Server :: " + br.readLine());

				pw.close();
				br.close();
				client.close();

				if (msg.equalsIgnoreCase("bye")) {
					break;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
