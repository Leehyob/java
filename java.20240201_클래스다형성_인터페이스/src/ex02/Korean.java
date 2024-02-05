package ex02;

public class Korean implements Information{
	boolean lang;
	
	@Override
	public void sayHi() {
		System.out.println("안녕");
	}
	
	@Override
	public void feeling() {
		System.out.println("지금 기분이 어떻니");
		System.out.println("피곤해");
		
	}
	@Override
	public void language() {
		lang = true;
		System.out.println("한국어 번역 시스템을 가동합니다.");
	}

}
