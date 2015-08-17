package 装饰模式;

public class ConcreteDecoratorC extends Decorator{ 

	@Override
	public void Operation(){
		super.Operation();
		AddedBehavior();
		System.out.println("具体对象C的操作");
	}

	private void AddedBehavior() {
		
		System.out.println("具体对象C的方法");
	}
}
