package BridgePattern;

public class Main {

	public static void main(String[] args) {
		
		CarAbstraction car = new Toyota(new JVC());
		car.showInfo();
	}
}
