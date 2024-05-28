package ex04;

import java.util.function.Function;

/*
 * 3.
int square(int x) {

   return x*x;
} 
 * */

interface shape{
	int square(int x);
}

public class Question3 {

	public static void main(String[] args) {
		shape nemo = new shape() {
			
			@Override
			public int square(int x) {
				
				return x*x;
			}
		};
		
		System.out.println(nemo.square(4));
		
		shape nemo2 = x -> x*x;
		
		System.out.println(nemo2.square(4));
		
		Function<Integer, Integer> f = a -> a*a*a;
		int result = f.apply(3);
		System.out.println(result);
	}
	
}
