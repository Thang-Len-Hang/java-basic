package ByteStreamDemo;

import java.io.*;

public class BufferStream {

	public static void main(String[] args) {

		try (BufferedInputStream in = new BufferedInputStream (new FileInputStream(new File("T:\\IO\\duck.png")));
				BufferedOutputStream out = new BufferedOutputStream (new FileOutputStream(new File("T:\\IO\\java1.png")))) {

			
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
