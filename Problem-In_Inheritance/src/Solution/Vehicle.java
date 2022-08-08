package Solution;

public class Vehicle {

	private GoAlgo goAlgo;
	
	public void setGoAlgo(GoAlgo goAlgo) {
		this.goAlgo = goAlgo;
	}

	public String go() {
		return goAlgo.go();
	}
}
