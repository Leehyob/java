package ex02;

public class Chu extends Dog{

	@Override
	void makeSound() {
		System.out.println("시츄 : 왕왕");
	}
	
	@Override
	void eat() {
		System.out.println("작은 사료");
	}
}
