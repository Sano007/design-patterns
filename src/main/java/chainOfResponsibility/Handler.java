package chainOfResponsibility;

public abstract class Handler {
	private final int maximum;
	private final String name;
	private Handler nextHandler;
	

	public Handler(int maximum, String name){
		this.maximum = maximum;
		this.nextHandler = null;
		this.name = name;
	}
	
	public void addHandler(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	protected void handleRequest(int salary){
		if(salary < this.maximum)
			System.out.println(String.format("%s aprooved your salary (%d).", name, salary));
		else if(nextHandler != null)
			nextHandler.handleRequest(salary);
	}
	
}
