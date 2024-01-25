package ex01;


public class method02 {

	public static void main(String[] args) {
		int num = abs(-10);
	}
	static int abs(int a) {
		System.out.println("절댓값 : " + a );
		
		return a>0 ? a : -a;
		//= return Math.abs(num);
	}
}
