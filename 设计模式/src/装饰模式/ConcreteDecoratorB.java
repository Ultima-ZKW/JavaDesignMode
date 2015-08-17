package 装饰模式;

public class ConcreteDecoratorB extends Decorator{ 

	private String addedState;

	@Override
	public void Operation(){
		super.Operation();
		addedState = "自有属性B";
		System.out.println("具体对象B的操作");
	}
}
