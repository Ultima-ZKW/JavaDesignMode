package װ��ģʽ;

public class ConcreteDecoratorA extends Decorator{ 

	private String addedState;

	@Override
	public void Operation(){
		super.Operation();
		addedState = "��������A";
		System.out.println("�������A�Ĳ���");
	}
}
