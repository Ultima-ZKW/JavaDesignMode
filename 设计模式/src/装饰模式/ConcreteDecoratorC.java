package װ��ģʽ;

public class ConcreteDecoratorC extends Decorator{ 

	@Override
	public void Operation(){
		super.Operation();
		AddedBehavior();
		System.out.println("�������C�Ĳ���");
	}

	private void AddedBehavior() {
		
		System.out.println("�������C�ķ���");
	}
}
