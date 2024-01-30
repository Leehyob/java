package ex03;

import java.util.Scanner;

public class array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] marks = new double[2][3];
		
		for(int i=0; i<2; i++) {
			System.out.println("학생번호 : " + (i+1));
			System.out.print("국어 점수 : ");
			marks[i][0]=sc.nextDouble();
			
			System.out.print("수학 점수 : ");
			marks[i][1] = sc.nextDouble();
			
			marks[i][2] =(marks[i][0] + marks[i][1])/2;
			
			
			}
		for(int i=0; i<2; i++) {
			System.out.println("학생 번호" + (i+1));
			System.out.print("국어 점수 : " + marks[i][0]);
			System.out.print("수학 점수 : " + marks[i][1]);
			System.out.println("평균 : " + marks[i][2]);
		}
	}

}
