package CompositePattern;

public class AuditVisiter implements IVisiter {

	@Override
	public void visit(Component component) {
		System.out.println(this.getClass().getSimpleName() + " visit by auditing::" + component.getName());
	}

}
