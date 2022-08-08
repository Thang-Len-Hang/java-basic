package CompositePattern;

public abstract class Component implements IVisitable {

	private String name;

	public Component(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void printTree();
	
	public void accept(IVisiter iVisiter) {
		iVisiter.visit(this);
	}

}
