package ex03.copy;

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
	
}
