package ex01;

import java.util.Scanner;

public class Exam01 {

	/*
	 * 메서드 : findMax
	 * 매개변수 : int[]
	 * 반환타입 : int
	 * 기능 : 정수 배열을 입력받아 배열 내의 최대값을 찾아 반환
	 */
	
	public static void main(String[] args) {
		System.out.println("정수 다섯 개를 입력하시오 : ");
		
		int[] a = {10,20,30,40,50};
	
		
		int num = findMax(a);
		
		System.out.println("max : " + num);
		
		
	
	}
	static int findMax(int[] a) {
		int max = 0;
		
		for(int i=0; i<a.length; i++) {
			if (a[i]>max) 
				max = a[i];
		}
				return max;
				
						
	
		
	}

}
