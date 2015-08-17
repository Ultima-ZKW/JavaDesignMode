package 适配器模式;

public class Test {

	public static void main(String[] args) {
		Target target = new Adapter();
		
		target.request();
		
		System.out.println("完成！");
	}
}
