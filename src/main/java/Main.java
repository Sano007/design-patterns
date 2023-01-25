import abstractFactory.AbstractFactory;
import abstractFactory.ConcreteFactory1;
import abstractFactory.ConcreteFactory2;
import chainOfResponsibility.ChainClient;
import factoryMethod.ConcreteFactory;
import factoryMethod.Factory;
import observer.*;
import prototype.PrototypeClient;
import singleton.Singleton;

public class Main {
	
	public static void main(String args[]){
		
		//Chain of responsibility
		{
			ChainClient client = new ChainClient();
			client.request(150);
			client.request(1500);
			client.request(9000);
			client.request(11000);
			client.request(1500000);
			System.out.println("");
		}
		
		//Iterator
		{
		
		}
		
		//Observer
		{
			Observable agency = new ConcreteObservable();
			Observer smsGuy = new ConcreteObserverA(agency);
			agency.setState("Welcome new customers!");
			new ConcreteObserverB(agency);
			new ConcreteObserverB(agency);
			new ConcreteObserverA(agency);
			agency.setState("We have BLACK FIRDAY!!!");
			smsGuy.detach();
			agency.setState("Last message");
			System.out.println();
		}
		
		//AbstractFactory
		{
			AbstractFactory factory1 = new ConcreteFactory1();
			AbstractFactory factory2 = new ConcreteFactory2();
			factory1.createProductA();
			factory1.createProductB();
			factory2.createProductB();
			factory2.createProductA();
			System.out.println("");
		}
		
		//Factory Method
		{
			Factory factory1 = new Factory();
			Factory factory2 = new ConcreteFactory();
			factory1.doSomething();
			factory2.doSomething();
			System.out.println();
		}
		
		//Prototype
		{
			new PrototypeClient();
			System.out.println();
		}
		
		//Singleton
		{
			Singleton singleton = Singleton.getInstance();
			singleton.printSomething();
			System.out.println();
		}
		
		//Adapter
		{
		
		}
	}
}
