package ������ģʽ;

public class Adapter extends Target{

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request(){
		adaptee.specificrequest();
	}
}
