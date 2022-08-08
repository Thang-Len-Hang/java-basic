package BridgePatternExercise;

public class JDBC extends IPersistance {

	

	public JDBC(IUI iUI) {
		super(iUI);
	}

	@Override
	public void showInfo() {
		System.out.println("JDBC with: " + iUI.getProgrammingName()); // variable is called from protected iAudio
	}

}
