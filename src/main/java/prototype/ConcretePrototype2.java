package prototype;

public class ConcretePrototype2 extends Prototype{
	protected static int idx = 0;
	protected final String name;
	
	public ConcretePrototype2() {
		idx++;
		name = "Prototype2";
	}
	
	public static int getIdx() {
		return idx;
	}
}
