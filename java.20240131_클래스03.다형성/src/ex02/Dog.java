package ex02;

public class Dog extends Animal{
	
	@Override
	void makeSound(){
		System.out.println("강아지 : 멍멍");
	}
	
	void eat() {
		System.out.println("큰 사료");
	}

}
