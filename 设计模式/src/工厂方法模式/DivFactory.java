package 工厂方法模式;

public class DivFactory implements IFactory {

	@Override
	public Operation CreateOperation() {

		return new OperationSub();
	}

}
