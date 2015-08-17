package 简单工厂模式;

public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		if(get_numberB() == 0){
			System.out.print("除数不能为零.");
		}
		result = get_numberA() / get_numberB();
		return result;
	}
	
}
