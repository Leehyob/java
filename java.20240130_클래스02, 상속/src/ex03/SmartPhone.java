package ex03;

public class SmartPhone extends Phone{
	
	private boolean wifi;
	
	public SmartPhone() {
		System.out.println("SmartPhone");
	}	
	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color);
		System.out.println("SmartPhone(boolean wifi)");
		this.wifi = wifi;
	}	
	
	@Override
	public String toString() {
		System.out.println(super.toString()); //상위클래스 toString 메소드 호출
		return "SmartPhone [wifi=" + wifi + "]";
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
	@Override //이노테이션 sendVoice는 상위클래스를 재정의한다.
			// 안정성 증가, 오버라이딩 표시
	public void sendVoice(String message) {
		System.out.println("음성메시지 : " + message);
	
	 //같은 변수명이 두 개 동시에 존재하면 내부의 것이 먼저 동작하고
	// 후에 외부가 출력됨
	}
	
}
