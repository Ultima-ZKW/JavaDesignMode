package ��������ģʽ;

public class SubFactory implements IFactory {

	@Override
	public Operation CreateOperation() {

		return new OperationDiv();
	}

}
