package ex05;

public class ChildSpeaker_s extends Speaker_s{
	 private boolean button;
	   private int volume;
	   
	   ChildSpeaker_s() {}
	   
	   ChildSpeaker_s(int volume) {
	      button = true;
	      this.volume = volume;
	   }
	   
	   @Override
	   public void powerOn() {
	      button = true;
	      System.out.println("전원이 켜졌습니다");
	   }
	   
	   @Override
	   public void powerOff() {
	      button = false;
	      System.out.println("전원이 꺼졌습니다");
	   }
	   
	   @Override
	   public void soundUp() {
	      volume++;
	      System.out.println("볼륨 : " + volume);
	   }
	   
	   @Override
	   public void soundDown() {
	      volume--;
	      System.out.println("볼륨 : " + volume);
	   }


	
}
