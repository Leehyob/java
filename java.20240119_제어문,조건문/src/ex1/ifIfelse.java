package ex1;

import java.util.Scanner;

public class ifIfelse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("나이를 입력하십시오 : ");
		int a = input.nextInt();
		
		if(a>=20) {
			System.out.println("성년입니다.");
		}
		if(a<20) {
			System.out.println("미성년입니다.");
		}
		/*if if 두 개의 문장으로 구성할 때는 과정을 두 번 거침 
		 *if else 문을 쓸 경우 한 번의 과정으로 끝남
		 **/
		
		int num = 120;
		
		if (num<50) {
			System.out.println("숫자가 50보다 작습니다.");
		}
		else {
			System.out.println("숫자가 50보다 큽니다.");			
		}
		
		
	}

}
