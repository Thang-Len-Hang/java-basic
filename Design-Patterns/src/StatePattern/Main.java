package StatePattern;

public class Main {

	public static void main(String[] args) {

		Context context = new Context();

		RedState redState = new RedState();
		redState.doAction(context);
		
		GreenState greenState = new GreenState();
		greenState.doAction(context);
		
		YellowState yellowState = new YellowState();
		yellowState.doAction(context);

		System.out.println("Current state: " + context.getState());
		
	}

}
