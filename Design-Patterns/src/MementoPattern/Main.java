package MementoPattern;

public class Main {

	public static void main(String[] args) {

		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();

		originator.setState("State 1");
		originator.setState("State 2");
		Memento memento = originator.saveStateToMemento();
		careTaker.addMemento(memento);

		originator.setState("State 3");
		originator.setState("State 4");
		originator.setState("State 5");
		Memento memento1 = originator.saveStateToMemento();
		careTaker.addMemento(memento);

		originator.setState("State 6");
		originator.setState("State 7");

		System.out.println("Current state: " + originator.getState());
		
		//originator.getStateFromMemento(memento);
		//originator.getStateFromMemento(memento1);
		originator.getStateFromMemento(careTaker.getMemento(1));
		System.out.println("First Save State: "+originator.getState());
	}

}
