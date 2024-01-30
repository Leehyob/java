package ex02;

public class Cat02 {

	//멤버 변수(필드) -- 재료(레시피)
		private String breed;
		private String color;
		
	//생성자(클래스 이름과 같다) -- 반환타입x, 변수의 초기화 역할
	Cat02(){
		
	}
		
	//멤버 메서드	-- 액션(미역을 3분 불린다.)
	//void(반환타입) eat(함수명) ()(매개변수)
	void eat(String a) {
		color = a;
		System.out.println("츄르를 먹는다.");
		System.out.println("칼라는 " + color + "이다.");
	}
	
	void scratch(String b) {
		breed = b;
		System.out.println("품종은 " + breed + "이다.");
		
	}
	void meow() {
		System.out.println("야옹");
	}


}
