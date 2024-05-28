package ex04;

import java.util.function.Supplier;

/*
 * 4.
int roll() {

   return (int)(Math.random() * 6);
}
 * */

interface Roll{
	int roll();
}

public class Question4 {
	public static void main(String[] args) {
		Roll roll1 = new Roll() {
			
			@Override
			public int roll() {
				return (int)(Math.random()*6);
			}
		};
		System.out.println(roll1.roll());
		
		Roll roll2 = () -> (int)(Math.random()*7);
		System.out.println(roll2.roll());
		
		Supplier<Integer> s = () -> (int)(Math.random()*7);
		System.out.println(s.get());
	}
	
	
}
