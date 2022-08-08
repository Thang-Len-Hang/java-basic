package ChainOfResponsibilityPattern;

public class Main {

	public static void main(String[] args) {
		
		BackEndLayer backEndLayer= new BackEndLayer();
		MiddleLayer middleLayer = new MiddleLayer(backEndLayer);
		FrontEndLayer frontEndLayer = new FrontEndLayer(middleLayer);
		frontEndLayer.help(2);
		
	}

}
