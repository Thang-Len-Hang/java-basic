package SerializedDemo;

import java.io.*;

public class DeSerializedDemo {

	public static void main(String[] args) {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {

			Student s = (Student) in.readObject();
			System.out.println(s);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
