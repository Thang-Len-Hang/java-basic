package SerializedDemo;

import java.io.*;

public class SerializedDemo {

	public static void main(String[] args) {

		Student s1 = new Student("John Doe", 23, "ISM");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))){
			
			out.writeObject(s1);
			System.out.println("Successfully serialized student in student.ser");
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
