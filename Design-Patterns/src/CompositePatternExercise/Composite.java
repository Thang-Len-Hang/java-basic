package CompositePatternExercise;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> components = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void printTree() {
		System.out.println(getName());
		for (Component component : components) {
			component.printTree();
		}
	}

}
