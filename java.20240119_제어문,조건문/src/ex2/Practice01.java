package ex2;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 :");
		int a = input.nextInt();
		System.out.println("정수를 하나 더 입력하세요 : ");
		int b = input.nextInt();
		
		if (a>b) {
			System.out.println("큰 값 : " + a + "\n" + "작은 값 : " + b);
		}
		else if (a<b) {
			System.out.println("큰 값 : " + b + "\n" + "작은 값 : " + a);			
		}
		else {			
			System.out.println("값이 같습니다.");
		}
		
		
        System.out.println("정수 입력1 : ");
        int num1 = input.nextInt();
		System.out.println("정수 입력2 : ");
		int num2 = input.nextInt();
		System.out.println("정수 입력3 : ");
		int num3 = input.nextInt();
		
		if (num1>=num2 && num1>=num3) {
			System.out.println(num1 + " 이 제일 큽니다.");
		}else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " 이 제일 큽니다.");
		}else if (num3>num1 && num3>num2) {
			System.out.println(num3 + " 이 제일 큽니다.");
		}else if (num2==num3 && num2>num1) {
			System.out.println(num2 + " 이 제일 큽니다.");
		}else {
			System.out.println("세 수가 같습니다.");
		}
		
		//풀이
		
		int n1=3, n2=2, n3=5;
		int max=n1;
		
		if (max>n2) {
			if(n3>max) {
				n3=max;
			}
		}else {
			if (n2>n3) {
				max=n2;
		}
			else {
				max=n3;
			}
					
				}
		System.out.println("최댓값 : " + max);
	}

}
