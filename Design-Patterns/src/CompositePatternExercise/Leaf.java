package CompositePatternExercise;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void printTree() {
		System.out.println("  " + getName());
	}

}
