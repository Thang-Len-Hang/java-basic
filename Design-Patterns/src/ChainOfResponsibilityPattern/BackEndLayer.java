package ChainOfResponsibilityPattern;

public class BackEndLayer implements IHelpContent {

	@Override
	public void help(int i) {
		System.out.println("This is back end layer");
	}

}
