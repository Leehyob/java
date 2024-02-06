package projectVer1;
import java.util.Scanner;

public class AddItem {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	static int mCartCount = 0;
	public static void menuCartAddItem(String[][] book) {
		Scanner scBook = new Scanner(System.in);
		bookList(book);
		System.out.println("4. 바구니에 항목 추가하기");		
		for(int i = 0; i<NUM_BOOK; i++) {
			for(int j=0; j<NUM_ITEM; j++) 
				System.out.print(book[i][j] + "|");
			System.out.println(" ");
			
		}
		boolean quit = false;
		
		while(!quit) {
			System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 : ");
			String str = scBook.nextLine();
			boolean flag = false;
			int numId;
			for(int i=0; i<NUM_BOOK; i++) {
				if(str.equals(book[i][0])) {
					numId=i;
					flag = true;
					
					if(flag) {
						System.out.println("장바구니에 추가하시겠습니까? Y|N : ");
						str = scBook.nextLine();
						if(str.toUpperCase().equals("Y")) {
							System.out.println(book[i][0] + "도서가 장바구니에 추가되었습니다.");
							if(!isCartInBook(book[numId][0])){
									mCartItem[mCartCount++] = new CartItem(book[numId]);
							}
								
						}
						quit = true;
						break;
					}else
						System.out.println("다시 입력해주세요.");
				}
				
			}
		}
	}
	public static void bookList(String[][] book) {
		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] = "IT전문서";
		book[0][6] = "2018/10/08";
		book[1][0] = "ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000";
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";
		book[2][0] = "ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000";
		book[2][3] = "고광일";
		book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
		book[2][5] = "컴퓨터 입문";
		book[2][6] = "2019/06/10";
	}
	public static boolean isCartInBook(String booId) {
		CartItem add = new CartItem();
		boolean flag = false;
		for(int i=0; i<mCartCount; i++) {
			if( add.bookID== mCartItem[i].getBookID()) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
				flag = true;
			}
		}
		return flag;
	}
	public static void menuCartItemInfo() {
		System.out.println("2. 장바구니 상품 목록 : ");	
		System.out.println("-------------------------------------------------");	
		System.out.println("도서ID \t |수량\t |합계 ");	
		for(int i=0; i<mCartCount; i++) {
			System.out.print("  " + mCartItem[i].getBookID() + "\t");
			System.out.print("  " + mCartItem[i].getQuantity() + "\t");
			System.out.print("  " + mCartItem[i].getTotalPrice() + "\t");
			System.out.println("  ");
		}
		System.out.println("-------------------------------------------------");
	}
}
			
				
	
	
	
	

