package observer;

public interface Observable {
	
	void attach(Observer observer);
	void detach(Observer observer);
	void notifyAllObservers();
	String getState();
	void setState(String message);
}
