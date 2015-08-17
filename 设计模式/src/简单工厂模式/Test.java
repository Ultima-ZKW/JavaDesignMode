package 简单工厂模式;

public class Test {
	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperate("*");
		oper.set_numberA(12);
		oper.set_numberB(234);
		System.out.println(oper.getResult());
	}
}
