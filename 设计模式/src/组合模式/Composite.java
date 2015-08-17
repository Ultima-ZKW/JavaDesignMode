package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
		
	}

	@Override
	public void add(Component c) {
		children.add(c);
		
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
		
	}

	@Override
	public void display(int depth) {
		System.out.println("名称："+name+"级别："+depth);
		
		for (Component component : children) {
			component.display(depth + 2);
		}
		
	}

}
