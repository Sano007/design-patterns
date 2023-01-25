package observer;

public class ConcreteObserverA implements Observer{
	
	private Observable subject;
	
	public ConcreteObserverA(Observable subject) {
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
		System.out.println(String.format("SMS < %s", subject.getState()));
	}
}
