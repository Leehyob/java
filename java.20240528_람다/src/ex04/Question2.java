package ex04;

import java.util.function.BiConsumer;

/*
 * 2. 
int printVar(String name, int i) {

   System.out.println(name+"="+i);
}
 * */

interface printable{
	void printVar(String name, int i);
}

public class Question2 {
	public static void main(String[] args) {
		printable print = new printable() {
			
			@Override
			public void printVar(String name, int i) {
				System.out.println(name + "+" + i);
			}
		};
		
		print.printVar("user", 1);
		
		printable print2 = (name, i) ->System.out.println(name + "-" + i);
		print2.printVar("name", 3);
		
		BiConsumer<String, Integer> bc = (name, i) ->System.out.println(name + "-" + i);
		bc.accept("이름", 4);
	}
	
}
