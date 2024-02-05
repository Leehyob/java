package exP01;

public class Tv {
	private String color;
	private boolean power;
	 int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
