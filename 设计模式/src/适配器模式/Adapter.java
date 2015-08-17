package ÊÊÅäÆ÷Ä£Ê½;

public class Adapter extends Target{

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request(){
		adaptee.specificrequest();
	}
}
