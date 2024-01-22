package ex01;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 나이는 : ");
		int age = input.nextInt();
		
		System.out.println("당신의 이름을 입력하세요 : ");
		input.nextLine();
		String name = input.nextLine();
		
		
		System.out.println("이름은 " + name + " " + "나이는 " + age + " " + "이에요");
		
		
		System.out.print("문자열 입력 : ");
		String m = input.nextLine();
		System.out.println("출력 결과 : " + m);
		
		int x = 1;
		int y = 2;
		int z = ++x + -y;
		System.out.println("출력 결과 : " + z );
		
		System.out.print("숫자1 : ");
		int a = input.nextInt();
		System.out.print("숫자2 : ");
		int b = input.nextInt();
		System.out.println("합계 : " + (a + b));
		System.out.println("평균 : " + (double)(a + b)/2);

	}

}
