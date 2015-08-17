package 原型模式;

public class ConcretePrototype1 extends Prototype{

	public ConcretePrototype1(String id) {
		super(id);
	}

	@Override
	public Prototype Clone() {
		return (Prototype)this.Clone();
	}

}
