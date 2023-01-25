package observer;

public interface Observer {
	void update();
	void detach();
	void attach(Observable subject);
}
