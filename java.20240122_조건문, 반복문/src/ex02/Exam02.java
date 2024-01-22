package ex02;


public class Exam02 {

	public static void main(String[] args) {
		//1~100 사이에 3의 배수이면서 5의 배수 합 구하고, 갯수 구하기
		
		int sum = 0;
		int num = 0;

	
		for(int i=1; i<=100; i++) {
			if (i%3==0 && i%5==0) {
				sum += i;
				num = i/15;
		}
		}
		
		System.out.println("배수의 합 : " + sum);
		System.out.println("배수의 갯수 : " + num);
		
		
		//풀이
		
		int su = 0;
		int count = 0;
		
		for(int n=1; n<=100; n++) {
			if(n%3==0 && n%5==0) {
				su +=n;
				count++;
			}
		}
		
		System.out.println("3과 5의 배수 합은 : " + su);
		System.out.println("3과 5의 배수 합은 : " + count);
	}	

}
