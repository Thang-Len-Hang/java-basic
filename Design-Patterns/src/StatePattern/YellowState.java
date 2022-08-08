package StatePattern;

public class YellowState implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
		
	}

	public String toString() {
		return "Yellow";
	}
	
}
