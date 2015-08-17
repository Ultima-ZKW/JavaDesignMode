package 工厂方法模式;

public class SubFactory implements IFactory {

	@Override
	public Operation CreateOperation() {

		return new OperationDiv();
	}

}
