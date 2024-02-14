package ex07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(33, "Toy");
		map.put(47, "Box");
		map.put(67, "Robot");
		
		System.out.println(map.get(33));
		
		//반복 출력할 때
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
			System.out.print(map.get(it.next()) + " ");
	}

}
