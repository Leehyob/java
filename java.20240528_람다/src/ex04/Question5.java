package ex04;

import java.util.function.Function;

/*
 * 5.
int sumArr(int[] arr) {

   int sum = 0;

   for(int i : arr) 

      sum += i;

   return sum;
}
 * */

interface Sum{
	int sumArr(int[] arr);
}

public class Question5 {

	public static void main(String[] args) {
		Sum sum = new Sum() {
			
			@Override
			public int sumArr(int[] arr) {
				
				int sum = 0;
				for(int i : arr) {
					sum += i;
				}
				
				return sum;
			}
		};
		
		int[] arr = {1,2,3,4,5};
		System.out.println(sum.sumArr(arr));
		
		Sum list = arr2 -> {
			int sum2 = 0;
			for(int j : arr2) {
				sum2 += j;
			}
			return sum2;
		};
		
		System.out.println(list.sumArr(arr));
		
		Function<int[], Integer> f = arr2 -> {
			int sum2 = 0;
			for(int j : arr2) {
				sum2 += j;
			}
			return sum2;
		};
		
		System.out.println(f.apply(arr));
	}

}
