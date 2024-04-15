package movie;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		
		Menu menu = MainMenu.getInstance();
//		객체 생성시 상위클래스를 참조변수 타입으로 잡는 이유
//		1)다형성에 용이 -> 오버라이딩 범위를 잡음, 수정도 적음
//		2)변수 타입이 상위클래스일 때 넣을 수 있는 타입이 많아짐
//		-> 참조형이 상위 클래스일 때 상위 클래스를 상속하고 있는 하위 클래스를 다 넣을 수 있음
		
		while(menu !=null) {
			menu.print();
			menu = menu.next();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
