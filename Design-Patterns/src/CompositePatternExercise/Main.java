package CompositePatternExercise;

public class Main {

	public static void main(String[] args) {
		
		Composite C = new Composite("C");
		
		Composite Bootcamp = new Composite("Bootcamp");
		Composite Design_Pattern = new Composite(" Design Pattern");
		Composite CS = new Composite(" CS");
		
		Leaf Singleton = new Leaf("Singleton");
		Leaf Composite = new Leaf("Composite");
		Leaf Strategy = new Leaf("Strategy");
		
		Leaf LinkedList = new Leaf("LinkedList");
		Leaf HashTab = new Leaf("HashTab");
		
		C.addComponent(Bootcamp);
		Bootcamp.addComponent(Design_Pattern);
		Bootcamp.addComponent(CS);
		
		Design_Pattern.addComponent(Singleton);
		Design_Pattern.addComponent(Composite);
		Design_Pattern.addComponent(Strategy);
		
		CS.addComponent(HashTab);
		CS.addComponent(LinkedList);
		
		C.printTree();
	}

}
