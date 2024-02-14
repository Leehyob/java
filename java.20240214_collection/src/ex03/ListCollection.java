package ex03;

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
		
		//저장된 문자열 출력
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		for(String str : list)
			System.out.print(str + " ");
		
		System.out.println();
		list.remove(0);
//		System.out.println(list.get(0));	//앞자리가 삭제되면 뒤 데이터들이 전부 앞으로 한 칸씩 이동
											//따라서 Arraylist는 빈번한 삭제가 있는 경우 속도가 저하될 수 있음
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		
	}

}
