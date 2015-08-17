package в╟йндёй╫;

public class Test {
	
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA dA = new ConcreteDecoratorA();
		ConcreteDecoratorB dB = new ConcreteDecoratorB();
		ConcreteDecoratorC dC = new ConcreteDecoratorC();
		
		dA.setComponent(c);
		dB.setComponent(dA);
		dC.setComponent(dB);
		dC.Operation();
		
	}
}
