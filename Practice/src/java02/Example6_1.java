package java02;

public class Example6_1 {
	private String color;
	private boolean power;
	 int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
		System.out.println("현재 채널 : " + channel);
	}
	void channelDown() {
		--channel;
		System.out.println("현재 채널 : " + channel);
	}
	void channel01() {
		channel =10;
	}
	
}

