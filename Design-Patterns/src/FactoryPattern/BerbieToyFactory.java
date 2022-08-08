package FactoryPattern;

public class BerbieToyFactory extends ToyFactoryAbstraction{

	@Override
	public IToy makeToy() {
		return new BerbieToy();
	}

}
