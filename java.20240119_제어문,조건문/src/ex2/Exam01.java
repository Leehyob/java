package ex2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 숫자입력
		 * 2.이 숫자가 3의 배수이면서 5의 비수이면 "좋아요"
		 * 아니면 "싫어요"
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num%15 == 0) {
			System.out.println("좋아요");
		}
		else {
			System.out.println("싫어요");
		}
		
		
		// 풀이
		
		System.out.println("정수 입력 : ");
		int number = sc.nextInt();
		
		if(number%3==0) {
			if(number%5==0) {
				System.out.println("좋아요");				
			}
			else {
				System.out.println("싫어요");
			}
		} else {
			System.out.println("싫어요");
		}
		
		//2
		
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		
		if(n%3==0 && n%5==0) {
			System.out.println("좋아요");
		}else {
			System.out.println("좋아요");			
		}

	}

}
