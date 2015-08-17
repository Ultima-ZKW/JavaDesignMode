package 装饰模式;

public class ConcreteDecoratorA extends Decorator{ 

	private String addedState;

	@Override
	public void Operation(){
		super.Operation();
		addedState = "自有属性A";
		System.out.println("具体对象A的操作");
	}
}
