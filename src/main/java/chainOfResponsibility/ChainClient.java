package chainOfResponsibility;

public class ChainClient {
	private final Handler handler;
	
	public ChainClient() {
		handler = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		handler3.addHandler(new ConcreteHandler4());
		handler2.addHandler(handler3);
		handler.addHandler(handler2);
	}
	
	public void request(int salary){
		handler.handleRequest(salary);
	}
}
