package decorator;

public class ConcreteDecorator2 implements Decorator{
	
	private Decorator decorator;
	
	public ConcreteDecorator2() {
		this(null);
	}
	
	public ConcreteDecorator2(Decorator decorator) {
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
		switch (operation){
			case SHOT:
				System.out.println("BANG!");
				break;
			default:
				if(decorator == null)
					System.out.println("Cannot do this operation");
				else
					decorator.doOperation(operation);
		}
		
	}
}