package BridgePattern;

public class Crown extends CarAbstraction {

	public Crown(IAudio iAudio) {
		super(iAudio);
		
	}

	@Override
	public void showInfo() {
		System.out.println("Crown with: "+iAudio.getAudioSystem()); //call from protected iAudio
	}

}
