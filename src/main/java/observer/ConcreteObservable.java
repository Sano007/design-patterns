package observer;

import java.util.ArrayList;

public class ConcreteObservable implements Observable{
	
	private ArrayList<Observer> observers;
	private String state;
	
	public ConcreteObservable() {
		observers = new ArrayList<>();
		state = "";
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
		notifyAllObservers();
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyAllObservers() {
		observers.stream()
				.forEach(observer -> observer.update());
	}
}
