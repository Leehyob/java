package ex01;

public class exam02 {

	/*
	 * 메소드 : calculateEvenSum
	 * 매개변수 : int
	 * 반환타입 : int
	 * 기능 : 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하라
	 */
	public static void main(String[] args) {
		
		int a= 100;
		int sum = calculateEvenSum(a);
		
		System.out.println(sum);
		

	}
	static int calculateEvenSum(int a) {
		
		int even = 0;
		
		for(int i=0; i<=a; i++) {
			if(i%2==0)
				even += i;
			
			
			
		}
		return even;
	}

}
