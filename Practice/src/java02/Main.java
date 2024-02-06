package java02;

public class Main {

	public static void main(String[] args) {
		doWork(new B());
		doWork(new C());
		doWork(new A());
	}
	
	
	static void doWork(A a) {
		if(a instanceof B) {
			B b = (B)a;
			b.fb();
		}else if(a instanceof C) {
			C c = (C)a;
			c.fc();
		}else 
			a.fa();
	}
}
