package ObserverPattern;

public class Boss implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Boss says::"+operation + " operation take place on record::" + record);
	}

}
