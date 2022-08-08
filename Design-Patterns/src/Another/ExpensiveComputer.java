package Another;

public class ExpensiveComputer implements IComputer {

	@Override
	public IMemory makeMemory() {
		return new ExpensiveMemory();
	}

	@Override
	public IScreen makeScreen() {
		return new HighResolution();
	}

	@Override
	public IStorage makeStorage() {
		return new ExpensiveStorage();
	}

}
