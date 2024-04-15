package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
public class Movie {
	
	private long id;	//영화 고유번호
	private String title;	//영화 제목
	private String genre; 	//영화 장르
	
	private static final File file = new File("src/movie/movies.txt");
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	public Movie(String title, String genre) {
		
		this(Instant.now().getEpochSecond(), title, genre);
		
		long id = Instant.now().getEpochSecond();
		System.out.println("id : " + Instant.now().getEpochSecond());
		
	}
	public static ArrayList<Movie> findAll(){
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				// 한 줄 읽어옴
				String[] temp = line.split(",");
				// , 기준으로 각각 넣어줌
									//문자로 인식된 데이터를 롱형으로 바꿔줌
				Movie m = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				
				movies.add(m);	//ArrayList에 파일 저장된 영화 목록 추가
			}
			
			br.close();
			
		}catch(FileNotFoundException e) {	//파일을 찾지 못했을 때 출력
			e.printStackTrace();
		}catch (IOException e) {	//??
			e.printStackTrace();
		}
		
		return movies;	//영화 객체가 담긴 ArrayList 반환
	}
	@Override
	public String toString() {
		return String.format("[%d]: %s(%s)",id,title,genre);	//format : 출력 형태 잡기. 형타입에 따라 변수가 자리 찾아서 들어감
							//정수형	문자열	(%c - 문자, %f - 실수)
	}
	
	public void save() {
		try {
			FileWriter fw = new FileWriter(file, true);
			
			fw.write(this.toFileString() + "\n");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete(String movieId) {
		BufferedReader br = null;
		String text  = "";
		String line  = "";
		try {
			br = new BufferedReader(new FileReader(file));
			
			while((line=br.readLine())!=null) {
				String[] temp = line.split(",");
				if(movieId.equals(temp[0])) {
					continue;
				}
				text += line + "\n";
			}
			br.close();
			
			FileWriter fw = new FileWriter(file);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String toFileString() {
		return String.format("%d,%s,%s",id, title, genre);
	}
	public static Movie findAll(String movieId) {
		Movie movie = null;
		BufferedReader bf = null;
		
		try {
			bf = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line=bf.readLine())!=null) {
				String[] temp = line.split(",");
				if(movieId.equals(temp[0])) {
					movie = new Movie(Long.parseLong(temp[0]), temp[1],temp[2]);
					break;
				}
			}
			bf.close();
			return movie;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return movie;
	}


}


