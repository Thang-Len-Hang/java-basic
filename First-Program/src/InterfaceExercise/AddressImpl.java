package InterfaceExercise;

public class AddressImpl implements AddressInterface {

	private int streetNumber;
	private String streetName;
	private String country;

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

	public AddressImpl(int streetNumber, String streetName, String country) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.country = country;
	}

	@Override
	public String toString() {
		return "AddressImpl [streetNumber=" + streetNumber + ", streetName=" + streetName + ", country=" + country
				+ "]";
	}
	
	
}
