package ObserverPattern;

public class Programmer implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Programmer says::"+operation + " operation take place on record::" + record);
	}

}
