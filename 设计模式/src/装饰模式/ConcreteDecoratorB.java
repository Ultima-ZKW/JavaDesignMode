package װ��ģʽ;

public class ConcreteDecoratorB extends Decorator{ 

	private String addedState;

	@Override
	public void Operation(){
		super.Operation();
		addedState = "��������B";
		System.out.println("�������B�Ĳ���");
	}
}
