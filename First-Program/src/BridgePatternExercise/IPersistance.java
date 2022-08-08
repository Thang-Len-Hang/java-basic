package BridgePatternExercise;

public abstract class IPersistance {

	protected IUI iUI;

	public IPersistance(IUI iUI) {
		this.iUI = iUI;
	}
	
	
	public abstract void showInfo();
	
	
}
