package java01;

import java.util.Scanner;

public class java01 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("남은 양 : " + result);
		
		int apple2 = 1;
		int totalPieces = 10;
		int number2 = 7;
		
		int result2 = totalPieces - number;
		System.out.println(result2);
		System.out.println(result2/10.0);
	

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. 종속 \t|2. 감속 \t|3. 중지");
			System.out.println("----------------------------------");
			System.out.println("선택 : ");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if (strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
