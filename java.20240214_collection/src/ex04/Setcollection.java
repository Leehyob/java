package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setcollection {

	public static void main(String[] args) {
		//중복 저장 불가, 순서가 없음
		Set<String> set = new HashSet<String>();
		//List<String> set = new ArrayList<String>(); 도 동작 가능
		
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		set.add("Cat");
		
		System.out.println("---------------------------");
			System.out.print(set);
		System.out.println("\n---------------------------");
		
		Iterator<String> it = set.iterator();	//반복자
		//for문 while문 가동을 가능하게 만듦
		//출력 패턴을 일정하게 만들어줌
		//출력을 다시 한 번 하고싶을 때는 생성을 한 번 더 해줘야 함
		
		
		while(it.hasNext()) {
			System.out.print(it.next() + '\t');
		}
		System.out.println();
		
	}

}
