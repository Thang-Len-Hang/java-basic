package ChainOfResponsibilityPattern;

public class FrontEndLayer implements IHelpContent {

	private static final int FRONT_END_LAYER = 1;

	private IHelpContent iHelpContent;

	public FrontEndLayer(IHelpContent iHelpContent) {
		this.iHelpContent = iHelpContent;
	}

	@Override
	public void help(int i) {
		if (i == FRONT_END_LAYER) {
			System.out.println("This is front end layer");
		} else {
			iHelpContent.help(i);
		}
	}

}
