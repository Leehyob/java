
public class Example {
	public static void action(A a) {
		
		a.method1();
		
		// a참조변수가 참조하는 대상이 C클래스이거나 C클래스를 상속한 클래스이면 true 반환
		if(a instanceof C) {
			C c = new C();
			c.method2();	
		}
			
	}
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
}
