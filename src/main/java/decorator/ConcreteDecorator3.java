package decorator;

public class ConcreteDecorator3 implements Decorator{
	
	private Decorator decorator;
	
	public ConcreteDecorator3() {
		this(null);
	}
	
	public ConcreteDecorator3(Decorator decorator) {
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
			case PHONE:
				System.out.println("Phone is ringing.");
				break;
			default:
				if(decorator == null)
					System.out.println("Cannot do this operation");
				else
					decorator.doOperation(operation);
		}
		
	}
}