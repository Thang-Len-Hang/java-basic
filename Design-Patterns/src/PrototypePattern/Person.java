package PrototypePattern;

public abstract class Person {

	private int personId;
	private String name;
	private String address;
	private int age;

	public Person() {

	}

	public Person(Person person) {
		this.personId = person.personId;
		this.name = person.name;
		this.address = person.address;
		this.age = person.age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract Person clone();

	@Override
	public String toString() {
		return super.toString() + "Person [personId=" + personId + ", name=" + name + ", address=" + address + ", age="
				+ age + "]";
	}

}
