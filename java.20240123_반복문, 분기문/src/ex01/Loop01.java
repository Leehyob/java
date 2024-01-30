package ex01;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("길이 : ");
		int len = sc.nextInt();
		
		for(int i=0; i<len; i++) {
			for (int j=0; j<i; j++) 
				System.out.print(" "); //빈 칸 출력
			
			for (int j=0; j<(2*len)-1-(i*2); j++) 
				System.out.print("*"); //별표 찍기
			
			System.out.println(""); //줄 변경
		}

	}

}
