package movie;

import java.util.ArrayList;
import java.util.List;

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
		case "1" :
			reserve();
			return this;
		case "2" :
			checkReservation();
			return this;
		case "3" : 
			cancelReservation();
			return this;
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
	
	private void reserve() {
		
		try {
			List<Movie> movies = Movie.findAll();
			for(Movie movie : movies) {
				System.out.println(movie);
			}
			System.out.println("예매할 영화를 선택하세요 : ");
			
			String movieId=sc.nextLine();
			Movie movie = Movie.findAll(movieId);
			
			//		좌석 현황
			ArrayList<Reservation> reservations=  Reservation.FindMovieId(movieId);
			
			Seats seats = new Seats(reservations);
			seats.show();
			System.out.println("좌석을 선택해주세요 :(예 : E-9) ");
			String seatName = sc.nextLine();
			seats.mark(seatName);
			
			Reservation reservation = new Reservation(movie.getId(), movie.getTitle(), seatName) ;
			reservation.save();
			
			
		}catch(Exception e){
			System.out.printf(">> 예매에 실패하였습니다. : %s\n",e.getMessage());
		}
	}
	

	private void cancelReservation() {
		System.out.println("예매번호를 입력하세요 : ");
		
		Reservation canceled = Reservation.cancel(sc.nextLine());
		
		if(canceled == null) {
			System.out.println("예매내역이 없습니다.");
		}else {
			System.out.printf(">> [취소 완료] : %s의 예매가 취소되었습니다.",canceled);
//			System.out.println(">> [취소 완료] : " + canceled + "의 예매가 취소되었습니다.");
		}
	}

	private void checkReservation() {
		System.out.println("예매번호를 입력하세요 : ");
		
		try {
			Reservation reservation = Reservation.FindById(sc.nextLine());
			
			if(reservation == null) {
				System.out.println("예매내역이 없습니다.");
			}else {
				System.out.println(">>[확인 완료]\n" + reservation);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private boolean checkAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		
		String admin = sc.nextLine();
		return "admin".equals(admin);
	}
	
}
