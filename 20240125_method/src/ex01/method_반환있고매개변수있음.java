package ex01;

public class method_반환있고매개변수있음 {

	/*
	 * 메소드 : max
	 * 매개변수 : int,int
	 * 반환 : int
	 * 두 정수 중 최대값 반환
	 */
	
	public static void main(String[] args) {
		System.out.println("최대값 출력");
		
		int max = max(5,10);
		System.out.println("최대값 : " + max);

	}
	static int max(int num1,int num2) {
		
		if (num1>num2)
			return num1;
		else
			return num2;
		
		// = return num1>num2? num1:num2;
		
	}

}
