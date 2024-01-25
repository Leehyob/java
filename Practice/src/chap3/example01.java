package chap3;

public class example01 {

	public static void main(String[] args) {
		
		int x=10, y=20;
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
		
		int a= 10;
		double b = 20;
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));
		
		int c=10;
		int d=10;
		System.out.println(c==d);
		System.out.println("c와 d는 같습니까? " + (c==d));

		
		System.out.println("x == y = " + (x==y));
		System.out.println("x != y = " + (x!=y));
		System.out.println("x > y = " + (x>y));
		System.out.println("x < y = " + (x<y));
		System.out.println("x >= y = " + (y>=x));
		System.out.println("x <= y = " + (y<=x));
		
		System.out.println(x<10 && x<20);
		System.out.println(x<10 || x<20);
		System.out.println(!(x<10 == x<20));
		
		int e= 5, f= 10;
		System.out.println(e>f);
		System.out.println(!(e>f));
		System.out.println((e==f) && (e==5));
		System.out.println((e!=f && (e==5)));
		System.out.println(!((e!=f) && (e==5)));
		
		System.out.println(x);
		x+=2;
		System.out.println(x);
		x*=2;
		System.out.println(x);
		x-=2;
		System.out.println(x);
		
		int g;
		System.out.println(c=a);
		System.out.println(b+=a);
		System.out.println(b-=a);
		System.out.println(b*=a);
		System.out.println(b/=a);
		System.out.println(b/=a);
	}


}
