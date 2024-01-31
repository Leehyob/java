package ex04;

public class Child extends Parent {
	String name = "홍길동";
	
	void detail() {
		super.detail();
		System.out.println(name);
	}
	void printDetails() {
		detail();
		System.out.println("부모 이름 : " + super.name);
		System.out.println("자식 이름 : " + name);
	}
}
