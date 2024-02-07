package ex01;

public class Exam01 {

	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
//		B b1 = new A(); //하위 클래스는 상위 클래스를 참조할 수 없기 때문에 하위클래스인 B가 상위 클래스인 A를 참조할 수 없음 ㅇㅇ
						//상위클래스는 하위클래스의 공통 특성을 다 가지고 있고 하위클래스가 상위클래스를 상속하고 있기에 하위 클래스의 참조가 가능하지만 
						//하위클래스의 경우, 공통 특성을 상위클래스로부터 상속받고, 상위클래스와 다른 객체가 존재하기 때문에 참조가 불가능함
		B b2 = new B();
		B b3 = new C();
		
		C c1 = new C();
		
		A aa1 = new B();
//		B bb1 = aa1; //상위클래스인 A가 하위클래스인 B를 참조할 수는 있지만 접근할 수는 없기 때문에 aa1은 B에 있는 객체를 사용할 수 없으므로 식이 성립이 안됨
		B bb2 = (B)aa1; //aa1을 B클래스로 타입 변환해주면 aa1이 B의 객체에 접근할 수 있게 되면서 식이 성립하게 됨 ㅇㅇ aa1의 접근 범위가 B까지로 늘어남
						//단, aa1이 참조하고 있는 범위가 B미만이었다면 참조범위가 애초에 B 미만이기 때문에 타입변환을 해줄 수 없음
		A aa2 = new C();
		C cc1 = (C)aa2; //위의 B 타입 변환과 같은 경우 ㅇㅇ
		
		testFunc();
		
		testFunc2(new C());
		testFunc2(new A());
		
		
		test(new A());
		
	}
	static void testFunc() {
		// funcA, funcB, funcC 출력
		A a = new C();
		C c = (C)a;
		c.funcA();
		c.funcB();
		c.funcC();
	}
	static void testFunc2(A a) {
		// funcA, funcB, funcC 출력
//		A a = new C();
		if(a instanceof C){
			C c =(C)a;  		//((C)a).funcC() 도 가능 ↓
			c.funcC();			//연산자 우선순위에서 .이 더 높기 때문에 (C)a.funcC는 a.funcC 가 먼저 실행된 후 (C)를 처리해주기 때문에 오류가 남. 때문에 ((C)a)와 같이 소괄호를 넣어줘 연산 순위를 바꿔줌
		}else if(a instanceof B) {
			B b = (B)a;
			b.funcB();
		}else
			a.funcA();
		
	}
	
	static void test(A a) {
		if(a instanceof C) {
			C c = (C)a;
			a.funcA();
			c.funcB();
			c.funcC();
		}else if(a instanceof B) {
			B b = (B)a;
			b.funcA();
			b.funcB();
		}else
			a.funcA();
	}

}

class A{
	void funcA(){
		System.out.println("funcA");
	}
}
class B extends A{
	void funcB(){
		System.out.println("funcB");
	}
}
class C extends B{
	void funcC(){
		System.out.println("funcC");
	}
}