package movie;

import java.util.ArrayList;

public class AdminMenu extends AbstractMenu {
	
	private static final AdminMenu instance = new AdminMenu(null);
	private static final String ADMIN_MENU_TEXT = 
			"1: 영화 등록하기 \n" + 
			"2 : 영화 목록 보기 \n" + 
			"3 : 영화 삭제하기 \n" + 
			"b : 메인 메뉴 이동 \n\n" + 
			"메뉴를 선택하세요 :" ;
	
	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT,prevMenu);
	}
	
	public static AdminMenu getInstance() {
		return instance;	//MainMenu 객체 생성 주소반환(싱글톤패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "1" :
			createMovie();	//영화 등록하기
			return this;
		case "2" :
			printAllMovies();	//영화 목록 출력
			return this;		//adminMenu 반환
		case "3" :
			deleteMovie();
			return this;
		case "b" : return prevMenu;	//왜 전으로 돌아감?
		default : return this;	//생성 객체값 반환 = null
		}
	}
	private void deleteMovie() {
		printAllMovies();
		
		System.out.println("삭제할 영화의 ID값을 입력하세요 : ");
		
			Movie.delete(sc.nextLine());
			System.out.println(">> 삭제되었습니다.");
		
	}

	private void createMovie() {
		System.out.println("제목 : ");
		String title = sc.nextLine();
		
		System.out.println("장르 : ");
		String genre = sc.nextLine();
		
		Movie movie = new Movie(title, genre);
		
			movie.save();
			System.out.println(">> 저장되었습니다.");
		}

	private void printAllMovies() {
		ArrayList<Movie> movies =  Movie.findAll(); //findAll 의 return값인 movies를 이 메소드 안 movies에 넣음
		
		System.out.println(Movie.findAll() +"\n");
		
		for(Movie movie : movies)		//for문 돌려서 각각의 목록 생성
			System.out.println(movie);	//for문이 돌아가면서 저장된 영화 목록 출력
//		//즉, 객체를 생성하고 for문을 이용하는 건 영화를 각각의 객체로 만들어 따로 출력될 수 있게 하기 위함임
		
//		System.out.println(Movie.findAll());	//얘도 되긴 하는데 목록 띄움을 못함 그냥 일자로 출력됨
	}
}
