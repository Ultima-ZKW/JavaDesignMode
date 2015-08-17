package 状态模式;

public class Context {
	
	private State state;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("当前状态："+state.getClass().getName());
	}

	public Context(State state){
		this.state = state;
	}
	
	public void request(){
		state.handle(this);
	}

}
