package 外观模式;

public class Facade {

	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA(){
		System.out.println("\n方法组A（）");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}
	
	public void methdB(){
		System.out.println("\n方法组B（）");
		two.methodTwo();
		three.methodThree();
	}
}
