package 代理模式;

public class Proxy extends Subject{
	
	RealSubject realSubject;

	@Override
	public void Request() {

		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.Request();
	}

}
