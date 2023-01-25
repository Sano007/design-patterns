package prototype;

public class ConcretePrototype1 extends Prototype{
	protected static int idx = 0;
	protected final String name;
	
	public ConcretePrototype1() {
		idx++;
		name = "Prototype1";
	}
	
	public int getIdx() {
		return idx;
	}
}
