package ex2;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		System.out.println("세 개의 정수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b) {
			if (a > c) {
				System.out.println(a + "는 가장 큰 정수입니다.");
			}
			else {
				System.out.println(a + "는 가장 큰 정수가 아닙니다.");
			}
		} else {
			System.out.println(a + "는 가장 큰 정수가 아닙니다.");
			
		}
		
		
		System.out.println("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		
		if (0<= age && age < 20) {
			if (age <=3) {
				System.out.println("당신의 버스 요금은 0원입니다.");
			} else if (age <=13) {
				System.out.println("당신의 버스 요금은 " + (1500*1/2) + "원입니다.");
			} else {
				System.out.println("당신의 버스 요금은 " +(1500-1500/4) + "원입니다.");
			}
		}else {
			System.out.println("당신의 버스 요금은 1500원입니다.");
		}
		
		
		
		//풀이
		
		final int CHARGE = 1500;
		double fee = 0;
		System.out.println("나이 입력 :");
		int ag = sc.nextInt();
		
		if(ag>=20); {
			fee = CHARGE*1.0;
		}if(ag>=14) {
			fee = CHARGE*0.75;
		}else if (ag >= 4) {
			fee = CHARGE*0.5;
		}else {
			fee = CHARGE*0;
		}
		
		System.out.println("당신 요금은 : " + (int)fee + "원");
	}

}
