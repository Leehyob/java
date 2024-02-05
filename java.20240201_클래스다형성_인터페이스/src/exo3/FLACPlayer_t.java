package exo3;

public class FLACPlayer_t implements MediaPlayer{

	private String fileName;
	private double runTime;
	private double fileSize;
	public static int state; //-1(정지) 0 (일시정지) 1(재생)
	
	@Override
	public void play() {
		state =1;
		System.out.println("재생 중........");
	}

	@Override
	public void stop() {
		state=-1;
		System.out.println("종료 중...");
	}
	
	@Override
	public void pause() {
		state=0;
		System.out.println("일시중지 중........");
	}

	@Override
	public void loadFile(String name, String length, String file) {
		
		MediaPlayer.super.loadFile(name, length, file);
	}
	
	//public void loadFile(String file) {
		//System.out.println(file + "이 저장됨");
		//System.out.println("loading...");
	


}
