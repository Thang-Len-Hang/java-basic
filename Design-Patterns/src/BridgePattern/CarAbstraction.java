package BridgePattern;

public abstract class CarAbstraction {

	protected IAudio iAudio;

	public CarAbstraction(IAudio iAudio) {
		this.iAudio = iAudio;
	}
	
	
	public abstract void showInfo();
	
	
}
