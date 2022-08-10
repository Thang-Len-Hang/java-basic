package ByteStreamDemo;

import java.io.*;

public class BufferReader {

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader (new FileReader(new File("T:\\IO\\text.txt")));
				BufferedWriter out = new BufferedWriter (new FileWriter(new File("T:\\IO\\copy1.txt")))) {

			String s = null;
			while ((s = in.readLine()) != null) {
				//System.out.print((char) i);
				out.write(s); //copy file
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
