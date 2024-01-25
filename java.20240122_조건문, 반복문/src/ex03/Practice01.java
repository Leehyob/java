package ex03;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A' : 
			System.out.println("매우 우수");
		case 'B' : 
			System.out.println("우수");
			break;
		case 'C' : 
			System.out.println("좋음");
			break;
		case 'D' : 
			System.out.println("좀 더 열심히");
			break;
		case 'E' : 
			System.out.println("미흡");
			break;
		 default : 
			System.out.println("잘못된 등급");
		}
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = input.nextInt();
		
		switch(score/10) {
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}


	}

}
