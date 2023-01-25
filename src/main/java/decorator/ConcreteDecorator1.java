package decorator;

//Buy & Sell
public class ConcreteDecorator1 implements Decorator{
	
	private Decorator decorator;
	
	public ConcreteDecorator1() {
		this(null);
	}
	
	public ConcreteDecorator1(Decorator decorator) {
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
			case BUY:
				System.out.println("Bought an item.");
				break;
			case SELL:
				System.out.println("Sold an item.");
				break;
			default:
				if(decorator == null)
					System.out.println("Cannot do this operation");
				else
					decorator.doOperation(operation);
		}
		
	}
}
