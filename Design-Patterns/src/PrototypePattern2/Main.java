package PrototypePattern2;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("Joe Dercy");
		Person clonePerson =(Person) person.clone();
		
		System.out.println(person);
		System.out.println(clonePerson);
		
		boolean test = person.equals(clonePerson);
		System.out.println("person and clonePerson are the same: "+ test);
	}

}
