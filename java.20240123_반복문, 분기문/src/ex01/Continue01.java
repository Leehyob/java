package ex01;

public class Continue01 {

	public static void main(String[] args) {
		//1부터 10 사이 홀수의 합
		
		int even = 0;
		
		for(int i=1; i<=10; i++) {
			if (i%2==1) {
				even += i;
			}
		}
		System.out.println(even);
	

		int sum = 0;
		for(int a=1; a<=10; a+=2) {
			sum += a;			
		}
			System.out.println(sum);
		
			
		int sum2 = 0;
		for(int b=1; b<=10; b++) {
			if(b%2==0)
				continue;
			
			sum2+=b;
			
		}
		System.out.println(sum2);
	}

}
