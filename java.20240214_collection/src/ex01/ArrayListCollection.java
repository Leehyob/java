package ex01;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
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
