package AdapterPattern;

public class TVAdapter {
	
	private TVAdaptee tvAdaptee;
	
	public TVAdapter(TVAdaptee tvAdaptee) {
		this.tvAdaptee = tvAdaptee;
	}
	
	public void switchOn() {
		tvAdaptee.turnRight();
	}
	
	public void switchOff() {
		tvAdaptee.turnLeft();
	}
}
