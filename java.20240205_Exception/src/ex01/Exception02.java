package ex01;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		int sum = func1();
		
		System.out.println("두 수 합은 : " + sum);
	}
	
	static int func1() {
		return func2();
	}
	
	static int func2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		 
		return num1+num2;
	}
}
