package ex03;

@FunctionalInterface	//인터페이스 추상 메소드를 하나로 제한함 -> 함수형 인터페이스화
interface Printable{
	void print(String msg);
}

//람다를 만들 수 있는 대상 : 함수형 인터페이스만 가능(인터페이스 안의 추상메소드가 한 개만 존재할 때)
					// 예외 : default 메소드, static 메소드(완전체) -> 추상 메소드 x 
public class Lambda3 {

	public static void main(String[] args) {

		// 람다 ㄱ		//매개변수 하나는 소괄호 필요 없음
		Printable prn = msg -> System.out.println(msg);
		//얘도 가능함 극단적으로 줄인 얘시
		Printable prn2 = System.out::println;
		/*==
		 * Printable prn = new Printable() {
			
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		 * */
		prn.print("메시지 출력");
		prn2.print("출력할 메시지");
	}
}

// 정리 : 람다는 추상메소드가 딱 하나만 존재하는 인터페이스(함수형 인터페이스)를 구현할 때 사용 가능함
//		매개변수가 하나일 때는 괄호를 생략해 더 간단한 형태로 만들 수 있음
//		매개변수가 여러 개 일때는 소괄호로 변수를 묶어서 화살표 표시해주기