package 工厂方法模式;

public class Test {
	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.CreateOperation();
		oper.set_numberA(12);
		oper.set_numberB(234);
		System.out.println(oper.getResult());
	}
}
