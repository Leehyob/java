package ex01;

public class Example01 {

	public static void main(String[] args) {
		
		//Cat이란 클래스를 통해 c1이란 참조변수가 참조하는 객체를 생성함
		Cat c1 = new Cat("페르시안 고양이", "흰색");
		// --> new Cat()은 Cat()이란 생성자 호출을 통해서 객체를 생성한다.
		c1.eat();
		c1.meow();
		
		Cat c2 = new Cat("코리아", "파랑");
		c2.eat();
		c2.meow();
		c2.setBreed("러시안 블루");
		c2.eat();
	}

}
