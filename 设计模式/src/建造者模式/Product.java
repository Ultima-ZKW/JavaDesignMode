package 建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Product {

	List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("\n产出 创建----");
		for (String part : parts) {
			
			System.out.println(part);
		}
	}
}
