package 享元模式;

public class UnsharedConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("不共享的具体Flyweight:"+extrinsicstate);
		
	}

}
