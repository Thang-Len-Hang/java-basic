package InterfaceExercise;

public class Person implements MyOwnInterface {

	private String name;

	private AddressInterface addressInterface;

	public void setAddressInterface(AddressInterface addressInterface) {
		this.addressInterface = addressInterface;
	}

	@Override
	public AddressInterface getAddress() {
		return addressInterface;

	}

	public AddressInterface getAddressInterface() {
		return addressInterface;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName()+" "+getAddress().getStreetNumber() + " " + getAddress().getStreetName() + " " + getAddress().getCountry();
	}

}
