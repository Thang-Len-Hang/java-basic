package Another;

public class Main {

	public static void main(String[] args) {
		
		IComputer computer = new CheapComputer();
		computer.makeMemory().setMemory();
		computer.makeScreen().setScreen();
		computer.makeStorage().setStorage();
	}

}
