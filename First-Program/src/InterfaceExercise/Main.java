package InterfaceExercise;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Aung Yee,");
		AddressImpl obj = new AddressImpl(123,", Min Min Road, ","Myanmar");
		person.setAddressInterface(obj);
		
		System.out.println(person);
		//name,streetNumber,streetName,country
	}

}
