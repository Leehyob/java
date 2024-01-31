package ex02;

public class Cat extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("고양이 : 야용");
	}
	void eat(){
		System.out.println("츄르 냠");
	}
	void color() {
		System.out.println("털 색깔");
	}
}
