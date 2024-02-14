package ex05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		
		//ArrayList와 LinkedList는 사용법이 같음 but 저장되는 메모리 구조가 다름
//		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
		//ArrayList와 LinkedList 두 클래스의 상위 클래스인 List 사용하면 편함, 수정거리 줄음
		List<String> list = new LinkedList<String>();
		
		//문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
//		list.add(10);	//타입 불일치
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}

}
