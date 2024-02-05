package projectVer1;

import java.util.Scanner;

public class Project80p {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";
		boolean quit = false;
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
		String[][] book = mBook;
		System.out.print("당신의 이름을 입력하세요 : " );
		String name = sc.nextLine();
		System.out.print("연락처를 입력하세요 : " );
		int phone = sc.nextInt();
		
		while(!quit) {
			System.out.println("**************************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			menuIntroduction();
			int menu = sc.nextInt();
			
			if(menu<1 || menu>8) {
				System.out.println("1부터 8 사이의 숫자를 입력하세요.");
			}else {
				switch(menu) {
				case 1 : 
					menuGuestInfo(name, phone);
					break;
				case 2 : 
					menuCartItemInfo();
					break;
				case 3 : 
					menuCartClear();
				case 4 :
					AddItem.bookList(book);
					AddItem.menuCartAddItem(book);
					break;
				case 5 :
					menuRemoveItemCount();
					break;
				case 6 : 
					menuRemoveItem();
					break;
				case 7 : 
					 menuCartBill();
					break;
				case 8 :
					 menuExit();
					quit = true;
					break;
					
				}
			}
		}
	}
	public static void menuIntroduction() {
		System.out.println("**************************************************");			
		System.out.println("1. 고객 정보 확인하기 \t 4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t 5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t\t 6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 \t\t 8. 종료");
		System.out.println("**************************************************");
		System.out.print("메뉴 번호를 선택해주세요");
	}
	public static void menuGuestInfo(String name, int phone) {
		System.out.println("1. 현재 고객 정보");
		Person person = new Person(name, phone);
		System.out.println("이름 : " + person.getName() + "연락처 : " + person.getPhone());
		
	}
	public static void menuCartItemInfo() {
		System.out.println("2. 장바구니 상품 목록 보기");			
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
	