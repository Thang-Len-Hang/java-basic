package BridgePatternExercise;

public class Bat3 extends IPersistance {

	

	public Bat3(IUI iUI) {
		super(iUI);
	}

	@Override
	public void showInfo() {
		System.out.println("Bat3 with: " + iUI.getProgrammingName()); // variable is called from protected iAudio
	}

}
