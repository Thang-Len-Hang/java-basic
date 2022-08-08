package PrototypePattern2;

public class Person implements IPrototype {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public IPrototype clone() {
		IPrototype obj;
		try {
			obj = (IPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		return obj;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
