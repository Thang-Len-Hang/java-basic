package AdapterPattern;

public class Main {
	public static void main(String[] args) {
		
		TVAdapter tv = new TVAdapter(new TVAdaptee());
		tv.switchOn();
		tv.switchOff();
	}
}
