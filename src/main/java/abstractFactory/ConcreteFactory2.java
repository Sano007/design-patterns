package abstractFactory;

public class ConcreteFactory2 implements AbstractFactory{
	@Override
	public AbstractProductA createProductA() {
		return new Vegetable();
	}
	
	@Override
	public AbstractProductB createProductB() {
		return new Fruit();
	}
}
