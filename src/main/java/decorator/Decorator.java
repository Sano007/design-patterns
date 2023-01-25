package decorator;

public interface Decorator {
	
	void doOperation(Operations operation);
	void getUpgrade(Decorator decorator);
}
