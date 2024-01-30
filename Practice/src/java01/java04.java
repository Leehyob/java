package java01;

import java.util.Scanner;

public class java04 {

	//임의의 두 수를 입력받아 출력하기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		boolean flag = true;
		while(flag) {
		powerOn();
		System.out.print("수를 입력하시오 : ");
		 a = sc.nextDouble();
		System.out.print("두 번째 수를 입력하시오 : ");
		 b = sc.nextDouble();
		
		if(a+b <200) {
			double num =plus(a,b);
			System.out.println(num);
			double avg = devide(a,b);
			System.out.println(avg);
		}else {
			powerOff();
			flag = false;
			break;
		}
		}	
		
		//ctrl + shift + { : 창분할
		

	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	static void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	static double plus(double x, double y) {
	double result = x+y;
	return result;}
	
	static double devide(double x, double y) {
		double result = (x+y)/2;
		return result;
	}
}
