package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		int sum = func1();
		
		System.out.println("두 수 합은 : " + sum);
	}
	
	static int func1() {
		return func2();
	}
	
	static int func2() {
		int num1 = 0,num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 : ");
		//내부에서 해결하기
		try {
			 num1 = sc.nextInt();
			 num2 = sc.nextInt();
		}catch(InputMismatchException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return num1+num2;
	}
}
