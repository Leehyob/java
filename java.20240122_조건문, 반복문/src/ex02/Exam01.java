package ex02;

public class Exam01 {

	public static void main(String[] args) {
		//1~100 사이 짝수 합과 홀수 합
		
		int sum=0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum = sum + i;
			System.out.println("합 :" + sum);
		}
		
		
	//풀이
		int even =0;
		int odd =0;
		
		for(int n=1; n<=100; n++) {
			
			if (n%2==0) {
				even += n;
			}else
				odd += n;
			
		}
		System.out.println("짝수 합 : " + even);
		System.out.println("홀수 합 : " + odd);
		
	
		

	}

}
