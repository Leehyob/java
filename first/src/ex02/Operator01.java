package ex02;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		double b = 2.0;
		System.out.println("a + b =" + (a + b));
		System.out.println("a - b =" + (a - b));
		System.out.println("a * b =" + (a * b));
		System.out.println("a / b =" + (a / b));
		System.out.println("a % b =" + (a % b));

		int c = 10;
		int d = 20;
		int e;
		System.out.println(e = c);
		System.out.println(d += c);
		System.out.println(d -= c);
		System.out.println(d *= c);
		System.out.println(d /= c);
		System.out.println(d %= c);
		
		int x = 10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);

		int q = 10, w = 10, z = 10, r = 10;
		
		System.out.println("q++ =>" + (q++));
		System.out.println("q =>" + q);
		System.out.println("++w =>" + (++w));
		System.out.println("z-- =>" + (z--));
		System.out.println("--r =>" + (--r));
	}

}
