package Another;

public class CheapComputer implements IComputer {

	@Override
	public IMemory makeMemory() {
		return new CheapMemory();
	}

	@Override
	public IScreen makeScreen() {
		return new LowResolution();
	}

	@Override
	public IStorage makeStorage() {
		return new CheapStorage();
	}

}
