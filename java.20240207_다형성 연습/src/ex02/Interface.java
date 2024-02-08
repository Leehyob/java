package ex02;

public interface Interface {
	
	String a();
	
	String b();
	
	int c();
	
	void d();
	
	static void e() {
		System.out.println("I`m groot");
	}
	
	default void f(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		System.out.println(sum);
	}
}
