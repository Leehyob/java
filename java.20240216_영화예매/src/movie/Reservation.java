package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class Reservation {
	
	private long id;
	private long movieId;	//영화 구별 번호
	private String movieTitle;	//영화 제목
	private String seatName;	//좌석
	
	public Reservation(long movieId, String movieTitle, String seatName) {
		this(Instant.now().toEpochMilli(), movieId, movieTitle, seatName);
	}
	
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file,true);
		
		fw.write(this.toFileString() + "\n");
		fw.close();
	}
	
	private String toFileString() {
		return String.format("%d,%d,%s,%s", id, movieId, movieTitle, seatName);
	}



	private static final File file = new File("src/movie/reservations.txt");
	
//	public Reservation(long id, long movieId, String movieTitle, String seatName) {
//		this.id = id;
//		this.movieId = movieId;
//		this.movieTitle = movieTitle;
//		this.seatName = seatName;
//	}
	
	public static Reservation FindById(String reservationId) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				if(reservationId.equals(temp[0])) {
					reservation = new Reservation(
							Long.parseLong(temp[0]), Long.parseLong(temp[1]),
							temp[2], temp[3]);
					break;
				}
			}
			br.close();
			return reservation;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Reservation cancel(String reservationId) {
		
		Reservation canceled = null;
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
			//		new file("src/movie/Reservations.txt") 경로로 파일 읽어옴
			String text = "";
			String line = null;
			
			while((line = bf.readLine())!=null) {
				String[] temp = line.split(",");
				if(reservationId.equals(temp[0])) {
					canceled = new Reservation(
							Long.parseLong(temp[0]) ,
							Long.parseLong(temp[1]),temp[2],temp[3]);
					continue;
				}
				
				text += line + "\n";
			}
			bf.close();
			FileWriter fw = new FileWriter(file);
			fw.write(text);
			fw.close();
			return canceled;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}return canceled;
	}
	
	
	@Override
	public String toString() {
		return String.format("영화 : %s, 좌석 : %s",movieTitle,seatName );
	}

		//데드맨 영화 예매 현황
	public static ArrayList<Reservation> FindMovieId(String movieId) throws Exception {
		ArrayList<Reservation> reservation = new ArrayList<Reservation>();
		BufferedReader bf = new BufferedReader(new FileReader(file));
		
		String line = null;
		
		while((line = bf.readLine())!=null) {
			String[] temp = line.split(",");
			if(movieId.equals(temp[1])) {	//영화 아이디
				long id = Long.parseLong(temp[0]); 	//예매 아이디
				long mId = Long.parseLong(temp[1]);	//영화 아이디
				String movieTitle = temp[2];
				String SeatName = temp[3];
				
				Reservation r = new Reservation(id, mId, movieTitle, SeatName);
				
				reservation.add(r);
			
			}
		}
		bf.close();
		
		return reservation;
	}


	
}
