package ex06;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(33, "Toy");
		map.put(47, "Box1");
		map.put(67, "Robot");
		map.put(47, "Box2");	//키가 중복되면 기존 값 덮어씀
		map.put(33, "Toy2");
	
		System.out.println(map.get(33));

	
	}

}
