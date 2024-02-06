package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception05 {

			//외부 던지기
			//받아 줄 대상이 없으니 JVM으로 넘어감
	public static void main(String[] args) throws InputMismatchException{
		int sum=0;
		
			sum = func1(); 	
		
		
		System.out.println("두 수 합은 : " + sum);
	}
	
	static int func1() {
		return func2();
	}
	
	static int func2() throws InputMismatchException { //외부로 던지기
		int num1 = 0,num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("func2 end......");
		return num1+num2;
	}
}
