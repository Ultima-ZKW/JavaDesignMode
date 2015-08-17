package 组合模式;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		
	}
	
	@Override
	public void add(Component c){
		System.out.println("Cannot add to a leaf");
	}
	
	@Override
	public void remove(Component c){
		System.out.println("Cannot remove to a leaf");
	}

	@Override
	public void display(int depth) {
		System.out.println("名称："+name+"级别："+depth);
		
	}

	
}
