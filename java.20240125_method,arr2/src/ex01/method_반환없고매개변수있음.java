package ex01;

public class method_반환없고매개변수있음 {

	/*
	 * 메소드 : max
	 * 매개변수 : int,int
	 * 반환 : void
	 * 두 정수 중 최대값 반환
	 */
	
	public static void main(String[] args) {
		System.out.println("최대값 출력");
		
		max(5,10);
		
		System.out.println("프로그램 종료");
		

	}
	static void max(int n, int n2) {
		
		int max = n>n2? n:n2;
		System.out.println("최대값 :" + max);
	}

}
