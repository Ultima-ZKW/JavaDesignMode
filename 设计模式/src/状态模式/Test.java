package ״̬ģʽ;

public class Test {

	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		
		c.request();
		c.request();
		c.request();
		c.request();
		
		System.out.println("��ɣ�");
	}
}
