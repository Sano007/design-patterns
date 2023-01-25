package prototype;

public class PrototypeClient {
	
	public PrototypeClient() {
		ConcretePrototype1 prt1 = new ConcretePrototype1();
		ConcretePrototype1 prt2 = (ConcretePrototype1) prt1.clone();
		Prototype prt3 = new ConcretePrototype2();
		Prototype prt4 = (Prototype) prt3.clone();
		System.out.println(String.format("%d, %s", prt1.getIdx(), prt1.name));
		System.out.println(String.format("%d, %s", prt2.getIdx(), prt2.name));
	}
}
