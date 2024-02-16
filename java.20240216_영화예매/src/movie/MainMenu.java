package movie;

public class MainMenu extends AbstractMenu{

	private static final MainMenu instance = new MainMenu(null);
	private static final String MAIN_MENU_TEXT = 
			"1: 영화 예매하기 \n" + 
			"2 : 예매 확인하기 \n" + 
			"3 : 예매 취소하기 \n" + 
			"4 : 관리자 메뉴로 이동하기 \n" + 
			"q : 종료 \n" + 
			"메뉴를 선택하세요 :" ;
				
	
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT,prevMenu);
	}
	
	public static MainMenu getInstance() {
		return instance;	//MainMenu 객체 생성 주소반환(싱글톤패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "4" :
			if(! checkAdminPassword()) {
				System.out.println(">> 비밀번호가 틀렸습니다.");
				return this;
			}
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);	//adminMenu의 주소값을 AdminMenu에서 MainMenu로 변경
			return adminMenu;	//반환
			
		case "q" : return prevMenu;	//MainMenu 주소값 반환
		default : return this;	//그 외 입력 : MainMenu로 돌아감
								//객체 자기 자신 -> 참조 대상
		}
		
	}
	
	private boolean checkAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		
		String admin = sc.nextLine();
		return "admin".equals(admin);
	}
	
}
