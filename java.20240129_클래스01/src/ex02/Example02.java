package ex02;

public class Example02 {

	public static void main(String[] args) {
		
		//Cat이란 클래스를 통해 c1이란 참조변수가 참조하는 객체를 생성함
		Cat02 c1 = new Cat02();
		// --> new Cat()은 Cat()이란 생성자 호출을 통해서 객체를 생성한다.
		c1.scratch("페르시안 고양이");
		c1.eat("흰색");
		
		Cat02 c2 = new Cat02();
		c2.scratch("러시안 블루"); 
		c2.eat("파랑");
	}

}
