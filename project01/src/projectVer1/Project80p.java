package projectVer1;

import java.util.Scanner;

public class Project80p {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	static User mUser;
	
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
		String phone = sc.nextLine();
		mUser = new User(name, phone);
		
		while(!quit) {
			System.out.println("**************************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			Welcome.menuIntroduction();
			int menu = sc.nextInt();
			
			if(menu<1 || menu>9) {
				System.out.println("1부터 8 사이의 숫자를 입력하세요.");
			}else {
				switch(menu) {
				case 1 : 
					Welcome.menuGuestInfo(name, phone);
					break;
				case 2 : 
					AddItem.menuCartItemInfo();
					break;
				case 3 : 
					Welcome.menuCartClear();
				case 4 :
					AddItem.bookList(book);
					AddItem.menuCartAddItem(book);
					break;
				case 5 :
					Welcome.menuRemoveItemCount();
					break;
				case 6 : 
					Welcome.menuRemoveItem();
					break;
				case 7 : 
					 Welcome.menuCartBill();
					break;
				case 8 :
					 Welcome.menuExit();
					quit = true;
					break;
				case 9 :
					menuAdminLogin();
					break;
				}
			}
		}
	}
	public static void menuAdminLogin() {
		System.out.println("관리자 정보를 입력하세요");
		Scanner input = new Scanner(System.in);
		System.out.println("아이디 : ");
		String adminId = input.nextLine();
		
		System.out.println("비밀번호 : ");
		String adminPW = input.nextLine() ;
		
		Admin admin = new Admin(mUser.getName(),mUser.getPhone());
		if(adminId.equals(admin.getId())||adminPW.equals(admin.getPassword())){
			System.out.println("이름" + admin.getName() + "연락처 " + admin.getPhone());
			System.out.println("아이디" + admin.getId() + "비밀번호 " + admin.getPassword());
		}else
			System.out.println("관리자 정보가 일치하지 않습니다.");
	}
	
}
	