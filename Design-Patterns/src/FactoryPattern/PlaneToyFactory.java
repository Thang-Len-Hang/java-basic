package FactoryPattern;

public class PlaneToyFactory extends ToyFactoryAbstraction{

	@Override
	public IToy makeToy() {
		return new PlaneToy();
	}

}
