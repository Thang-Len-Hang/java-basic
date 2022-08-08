package BridgePattern;

public class Mark2 extends CarAbstraction {

	public Mark2(IAudio iAudio) {
		super(iAudio);

	}

	@Override
	public void showInfo() {
		System.out.println("Mark2 with: " + iAudio.getAudioSystem()); // variable is called from protected iAudio
	}

}
