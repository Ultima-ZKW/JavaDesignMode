package 观察者模式;

public class ConcreteObserver extends Observer{

	private String name;
	private String observerstate;
	private ConcreteSubject subject;
	
	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

	public ConcreteObserver(ConcreteSubject subject,String name){
		this.subject = subject;
		this.name = name;
	}
	
	@Override
	public void update() {

		observerstate = subject.getSubjectState();
		System.out.println("观察者"+name+"的新状态"+observerstate);
	}

}
