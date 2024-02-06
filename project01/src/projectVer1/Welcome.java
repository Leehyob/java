package projectVer1;

public class Welcome {
	
	public static void menuIntroduction() {
		System.out.println("**************************************************");			
		System.out.println("1. 고객 정보 확인하기 \t 4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t 5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t\t 6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 \t\t 8. 종료");
		System.out.println("9. 관리자 로그인");
		System.out.println("**************************************************");
		System.out.print("메뉴 번호를 선택해주세요");
	}
	public static void menuGuestInfo(String name,String phone) {
		System.out.println("1. 현재 고객 정보");
		Person person = new Person(name, phone);
		System.out.println("이름 : " + person.getName() + "연락처 : " + person.getPhone());
		
	}
	
	
				
				
	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}
	
	public static void menuRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}
	public static void menuRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
		}
	public static void menuExit() {
		System.out.println("시스템을 종료합니다.");
	}
}
