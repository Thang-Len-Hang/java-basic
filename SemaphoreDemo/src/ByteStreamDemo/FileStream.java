package ByteStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) {

		try (FileInputStream in = new FileInputStream(new File("T:\\IO\\duck.png"));
				FileOutputStream out = new FileOutputStream(new File("T:\\IO\\java.png"))) {

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
