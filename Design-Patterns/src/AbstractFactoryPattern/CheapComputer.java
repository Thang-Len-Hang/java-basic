package AbstractFactoryPattern;

public class CheapComputer implements IComputer {

	@Override
	public void setScreen() {
		System.out.println("Low resolution");

	}

	@Override
	public void setStorage() {
		System.out.println("HDD");
	}

	@Override
	public void setRam() {
		System.out.println("Low speed Ram");

	}

	@Override
	public void setSoundCard() {
		System.out.println("Low quantity sound card");

	}

}
