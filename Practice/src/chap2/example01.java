package chap2;

public class example01 {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		int b;
		b = 20;
		System.out.println(b);
		
		final int SPEED = 20;
		int count = 10;
		count = 11;
		System.out.println(SPEED + count);
		
		final double PI = 3.14;
		System.out.println("반지름 3인 원의 넓이를 구합니다.");
		System.out.println(3*3*3.14);
		
		byte by = 2;
		short s = 6;
		int i = 10;
		long l = 125362133223L;
		System.out.println(i);
		System.out.println(s);
		System.out.println(by);
		System.out.println(l);
		
		float f = 65.20298f;
		double d = 876.765;
		System.out.println(f);
		System.out.println(d);

		char ch = 'J';
		char ch2 = 'a';
		char ch3 = 'v';
		char ch4 = 'a';
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		
		String str = "Java";
		String str2 = "Program";
		System.out.println(str);
		System.out.println(str2);

		boolean t = true;
		boolean fa = false;
		System.out.println(t);
		System.out.println(fa);
		
		System.out.println("Java " + "Program");
		
		String myName = "홍길동";
		int age = 20;
		System.out.println("이름 : " +  myName);
		System.out.println("나이 : " + age);
		
		System.out.println("Java" + "\n" + "Program");
	}

}
