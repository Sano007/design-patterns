package factoryMethod;

public class Factory {
	public Product factoryMethod(){
		return null;
	}
	
	public void doSomething(){
		Product product = factoryMethod();
		if(product != null)
			System.out.println(String.format("Z %s bola postavena bytovka.", product.name()));
		else
			System.out.println("It's abstract class baka!");
	}
}
