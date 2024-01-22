package ex2;

import java.util.Scanner;

public class Bus02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("나이를 입력하세요 : ");
	int age = sc.nextInt();
	
	final int CHARGE = 1500;
	double fee = 0;
	
	if (age>=65) {
		fee = CHARGE*0.0;
	} else if (age >= 20) {
		fee = CHARGE*1.0;
	} else if (age >= 14) {
		fee = CHARGE*0.75;
	} else if ( age >= 4) {
		fee = CHARGE *0.5;
	} else {
		fee = CHARGE *0.0;
	} 
	
	System.out.println("당신 요금은 : " + (int)fee + "원");

	}

}
