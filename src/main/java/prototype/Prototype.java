package prototype;

public class Prototype implements Cloneable {
	
	@Override
	protected Object clone(){
		Object clone = null;
		
		try {
			clone = super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}
