package ex04;

import java.util.function.BiFunction;

/*
 * 1. 
int max(int a, int b) {

   return a > b ? a : b;
}

 * */

interface test{
	int max(int a, int b);
}

public class Question1 {

	public static void main(String[] args) {
		test num1 = new test() {
			
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		System.out.println(num1.max(1, 2));
		
		test num2 = (a, b) -> a>b ? a:b;
		
		System.out.println(num2.max(3, 2));
		
		//메소드 참조
		test num3 = Integer::max;
		System.out.println(num3.max(67, 12));
		
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> a>b ? a:b;
		System.out.println(bf.apply(4, 1));;
	}
	
}
