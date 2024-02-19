package movie;

import java.io.File;

public class Reservation {
	
	private long id;
	private long movieId;	//영화 구별 번호
	private String movieTitle;	//영화 제목
	private String SeatName;	//좌석
	
	private static final File file = new File("src/movie/reservation.txt");
	
}
