package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Database implements Subject {

	private String operation;
	private String record;
	private List<Observer> observerList = new ArrayList<>();


	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observerList) {
			o.update(operation, record);
		}
	}

	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObserver();
	}

}
