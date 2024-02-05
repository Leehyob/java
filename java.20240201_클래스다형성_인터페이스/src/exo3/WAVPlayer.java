package exo3;

public class WAVPlayer implements MediaPlayer{
	String name;
	String length;
	String file;
	String now;
	
	WAVPlayer(){
	}
	
	@Override
	public void play(String now) {
		this.now = now;
		System.out.println("WAV 파일 재생 중...");
	}

	@Override
	public void stop(String now) {
		this.now = now;
		System.out.println("WAV 파일 재생을 종료합니다.");
	}

	@Override
	public void pause(String now) {
		this.now = now;
		System.out.println("WAV 파일 일시 정지 중...");
	}

	@Override
	public void loadFile(String name, String length, String file) {
		this.name = name;
		this.length = length;
		this.file = file;
			
		System.out.println("파일 이름 : " + name);
		System.out.println("재생 시간 : " + length);
		System.out.println("파일 크기 : " + file);
		if(now == "재생") 
			System.out.println("WAV파일을 재생중입니다.");
		else if(now == "중지")
			System.out.println("시스템을 종료했습니다.");
		else if(now == "정지")
			System.out.println("재생 정지 상태입니다.");
		else
			System.out.println("시스템 오류입니다.");
			
		
	}

	
}
