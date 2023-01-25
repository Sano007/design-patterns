package observer;

public class ConcreteObserverB implements Observer{

	private Observable subject;
	
	public ConcreteObserverB(Observable subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	public void detach(){
		subject.detach(this);
	}
	
	@Override
	public void attach(Observable subject) {
		if(this.subject == null)
			this.subject = subject;
	}
	
	@Override
	public void update() {
		if(subject == null) return;
		System.out.println(String.format("Email < %s", subject.getState()));
	}
}