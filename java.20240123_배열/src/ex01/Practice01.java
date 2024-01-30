package ex01;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		//int형 배열 생성 후 랜덤(1~100) 이용해서 배열 크기 20 값 저장
		//배열 총점, 평균 구하기
		int[] sum = new int[20];
		
		for (int i=0; i<sum.length; i++) {
			int numb = (int)((Math.random()*100)+1);
			sum[i] = numb+1;
		}
		
		for (int i=0; i<20; i++)
			System.out.print(sum[i] + " ");
		
		System.out.println("\n-----------------------------------");
		
		
		//5개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		
		int[] rang = new int[5];
		
		for(int i=0; i<5; i++) {
			int zhi = (int)((Math.random()*100)+1);
			rang[i]=zhi+1;

			System.out.print(rang[i] + " ");
		}
		int total = 0;
		double avg = 0;
		for (int i=0; i<5; i++) {
			total += rang[i];
		}
		avg = (double)total/rang.length;
		System.out.println("총합 : " + total + " 평균 : " + avg);
			
			
		int max = 0;
		int two = 0;
		for(int i=0; i<rang.length; i++) {
			if (rang[i]>max) {
				max = rang[i];
				two = i+1;
		
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("자릿수 : " + two);
		
		System.out.println("\n-----------------------------------");
		//로또 번호 6개 구하기
		//작은 수에서 큰 수로 배열
		
		
		int[] num = new int[45];
		
		for (int i=0; i<num.length; i++)
			num[i] = i + 1;

		for (int i=0; i<num.length; i++) {
		int ran = (int)((Math.random()*44)+1);
		int emp = num[0];
		num[0] = num[ran];
		num[ran] = emp;
					
		}
			
		for(int i=0; i<6; i++)
			System.out.print(num[i] + " ");
		
			
		
		
	
		
	}

}
