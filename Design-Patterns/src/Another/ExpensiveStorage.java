package Another;

public class ExpensiveStorage implements IStorage{

	@Override
	public void setStorage() {
		System.out.println("Expensive Storage");
	}
	
}
