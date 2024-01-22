package ex02;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		
		System.out.println("누적합 : " + sum);

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다섯 개의 숫자를 입력하세요.");
		
		int su = 0;
		for(int n =1; n <= 5; n++) {
			int num = sc.nextInt();
			su+=num;
		}
		
		System.out.println("합계 : " + su);
	}

}
