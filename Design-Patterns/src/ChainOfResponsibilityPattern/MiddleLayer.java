package ChainOfResponsibilityPattern;

public class MiddleLayer implements IHelpContent {

	private static final int MIDDLE_LAYER = 2;

	private IHelpContent iHelpContent;

	public MiddleLayer(IHelpContent iHelpContent) {
		this.iHelpContent = iHelpContent;
	}

	@Override
	public void help(int i) {
		if (i == MIDDLE_LAYER) {
			System.out.println("This is middle layer");
		} else {
			iHelpContent.help(i);
		}
	}

}
