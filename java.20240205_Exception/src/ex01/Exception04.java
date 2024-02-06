package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception04 {

	public static void main(String[] args) {
		int sum=0;
		
		try {
			sum = func1(); 	
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
		// func2에서 예외를 던지기 때문에 두 가지 방법으로 예외 처리 가능
		//내부 처리, 외부 던지기
		
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
