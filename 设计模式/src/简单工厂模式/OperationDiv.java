package �򵥹���ģʽ;

public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		if(get_numberB() == 0){
			System.out.print("��������Ϊ��.");
		}
		result = get_numberA() / get_numberB();
		return result;
	}
	
}
