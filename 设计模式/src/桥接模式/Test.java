package �Ž�ģʽ;

public class Test {
	public static void main(String[] args) {
		
		Abstraction ab = new RefinedAbstration();
		
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
		
		System.out.println("��ɣ�");
		
	}

}
