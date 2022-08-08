package AbstractFactoryPattern;

public class ExpensiveComputer implements IComputer {

	@Override
	public void setScreen() {
		System.out.println("High resolution");

	}

	@Override
	public void setStorage() {
		System.out.println("SSD");

	}

	@Override
	public void setRam() {
		System.out.println("High speed Ram");

	}

	@Override
	public void setSoundCard() {
		System.out.println("High quantity sound card");

	}

}
