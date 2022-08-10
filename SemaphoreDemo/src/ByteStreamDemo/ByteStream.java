package ByteStreamDemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {

		try (FileReader in = new FileReader(new File("T:\\IO\\text.txt"));
				FileWriter out = new FileWriter(new File("T:\\IO\\another.txt"))) {

			int i = 0;
			while ((i = in.read()) != -1) {
				//System.out.print((char) i);
				out.write(i); //copy file
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
