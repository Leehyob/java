package ex04;

import java.util.function.Supplier;

/*
 * 6.
int[] emptyArr() {

   return new int[] {};
}
 * */

interface Empty{
	int[] emptyArr();
}

public class Question6 {

	public static void main(String[] args) {

		Empty empty = new Empty() {
			
			@Override
			public int[] emptyArr() {
				
				return new int[] {};
			}
		};
		
		System.out.println(empty.emptyArr().length);
		
		Empty empty2 = () -> new int[] {};
		System.out.println(empty2.emptyArr().length);
		
		Supplier<int[]> s= () -> new int[] {};
		System.out.println(s.get().length);
	}

}


/*
 * consumer accept 입력有 -> 출력無 
 * function apply 입력有 -> 출력有
 * predicate test 입력有 -> 출력有（boolean）
 * supplier get 입력無 -> 출력有
 * */
 