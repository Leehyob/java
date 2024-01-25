package ex03;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요. : ");
		
		for (int i=1; i<=5; i++) {
			int num = input.nextInt();
			sum += num;
			System.out.println("합계 : " + sum);
		}
		
		
	
	

	}

}
