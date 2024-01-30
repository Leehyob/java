package ex01;

public class Cat {

	//멤버 변수(필드) -- 재료(레시피)
		private String breed;
		private String color;
		
		//멤버 변수 값 대입 및 변경은
		//생성자를 이용 또는 setter를 이용해서 값을 변경 혹은 초기화
		
		//추가 = setter, getter
		//setter는 변수값을 변경할 때 사용
		//getter는 변수값을 읽어줄 때 사용
		
		//setter -> set+변수명 조합 --> 카멜표기법
		
		void setBreed(String s) {
			breed = s;
		}
		void setColor(String c) {
			color = c;
		}
		
	//생성자(클래스 이름과 같다) -- 반환타입x, 변수의 초기화 역할
	Cat(){
		
	}
	Cat(String a, String b){
		breed = a;
		color = b;
		
	}
	//멤버 메서드	-- 액션(미역을 3분 불린다.)
	//void(반환타입) eat(함수명) ()(매개변수)
	void eat() {
		System.out.println(breed);
		System.out.println(color);
	}
	
	void scratch() {
		
	}
	void meow() {
		System.out.println("야옹");
	}


}
