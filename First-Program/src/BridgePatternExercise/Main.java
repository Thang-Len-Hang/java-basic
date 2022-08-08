package BridgePatternExercise;

public class Main {

	public static void main(String[] args) {
		
		IPersistance ui = new JDBC(new Angular());
		ui.showInfo();
	}
}
