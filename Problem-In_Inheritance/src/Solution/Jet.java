package Solution;

public class Jet extends Vehicle {
	
	public Jet() {
		//setGoAlgo(new GoByFlyingHighAlgo());
		setGoAlgo(new GoByLandingAlgo());
	}
}
