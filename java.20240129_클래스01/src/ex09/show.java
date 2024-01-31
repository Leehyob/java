package ex09;

public class show {

	public static void main(String[] args) {
		
		//인스턴스 메소드는 객체를 생성한 다음 참조변수로 접근 가능
		Person.staticShow();
		
		Person p1 = new Person();
		p1.showInfo();

	}

}
