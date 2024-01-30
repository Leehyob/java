package ex02;

public class methodOverLoad01 {

	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10.1,20.3));
		

	}
	static int add(int a, int b) {
	return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c ;
	}
	static double add(double a, double b) {
		return a+b;
	}
	static int add(int a, double b) {
		return (int)(a+b);
	}


}
