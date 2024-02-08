package ex02;


public class Controller {

	public static void main(String[] args) {
		
		Abstract_1 ab = new Abstract_1();
		
		Abstract.a();
		System.out.println(ab.b());
		ab.c();
		System.out.println(ab.d());
		ab.e("hello");
		
		Interface in;
		in = new Interface_1();
		
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(in.a());
		System.out.println(in.b());
		System.out.println(in.c());
		in.d();
		in.f(arr);
		Interface.e();
		Interface_1 inter = new Interface_1();
		inter.random2();
		inter.random();
	}

}
