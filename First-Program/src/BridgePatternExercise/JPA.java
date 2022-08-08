package BridgePatternExercise;

public class JPA extends IPersistance {

	

	public JPA(IUI iUI) {
		super(iUI);
	}

	@Override
	public void showInfo() {
		System.out.println("JPA with: " + iUI.getProgrammingName()); // variable is called from protected iAudio
	}

}
