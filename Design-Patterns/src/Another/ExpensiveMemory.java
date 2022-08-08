package Another;

public class ExpensiveMemory implements IMemory{

	@Override
	public void setMemory() {
		System.out.println("Expensive Memory");
	}
	
}
