package ex02;

public class Example02 {

	public static void main(String[] args) {
		int x = 10, y = 10;
		System.out.println(x == 10);
		System.out.println("x와 y는 같습니까?" + (x == y));
		
		int a = 10, b = 25;
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("b >= a = " + (b >= a));
		System.out.println("b <= a = " + (b <= a));
		
		int c = 10;
		System.out.println(c < 10 && c < 20);
		System.out.println(c < 10 || c < 20);
		System.out.println(!(c < 10 && c < 20));
		
		int d = 5, e = 10;
		System.out.println(d > e);
		System.out.println(d < e);
		System.out.println((d == e) && (d == 5));
		System.out.println((d != e) && (d == 5));
		System.out.println(!((d != e) && (d == 5)));

		int z = 10;
		System.out.println(z);
		z += 2;
		System.out.println(z);
		z *= 2;
		System.out.println(z);
		z -= 2;
		System.out.println(z);
		
		
	}

}
