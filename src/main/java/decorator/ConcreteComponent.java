package decorator;

public class ConcreteComponent implements Component{

	private Decorator decorator;
	
	public ConcreteComponent() {
		this(null);
	}
	
	public ConcreteComponent(Decorator decorator) {
		this.decorator = decorator;
	}
	
	@Override
	public void getUpgrade(Decorator decorator) {
		if(this.decorator == null)
			this.decorator = decorator;
		else
			this.decorator.getUpgrade(decorator);
		
	}
	
	@Override
	public void doOperation(Operations operation) {
		if(operation == Operations.WALK)
			System.out.println("Walking");
		else if(decorator != null)
			decorator.doOperation(operation);
		else
			System.out.println("Cannot do this operation");
			
		
	}
	
	
	public static void main(String args[]){
		Component component = new ConcreteComponent();
		component.doOperation(Operations.WALK);
		component.doOperation(Operations.PHONE);
		component.getUpgrade(new ConcreteDecorator2());
		component.doOperation(Operations.SHOT);
		component.doOperation(Operations.BUY);
		component.getUpgrade(new ConcreteDecorator1());
		component.doOperation(Operations.BUY);
		component.getUpgrade(new ConcreteDecorator3());
		component.doOperation(Operations.PHONE);
		component.doOperation(Operations.WALK);
	}
}
