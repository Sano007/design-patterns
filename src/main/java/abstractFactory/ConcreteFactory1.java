package abstractFactory;

public class ConcreteFactory1 implements AbstractFactory{
	@Override
	public AbstractProductA createProductA() {
		return new Meat();
	}
	
	@Override
	public AbstractProductB createProductB() {
		return new Milk();
	}
}
