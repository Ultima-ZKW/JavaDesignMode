package 代理模式;

public class RealSubject extends Subject {

	@Override
	public void Request() {
		
		System.out.println("真实的请求");
	}

}
