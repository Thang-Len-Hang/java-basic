package FactoryPattern;

public class RobotToyFactory extends ToyFactoryAbstraction {

	@Override
	public IToy makeToy() {
		return new RobotToy();
	}

}
