package ex04;

public class Speaker {
	private int sum = 0;
	boolean power;
	Speaker(){
		System.out.println("제품명 : A");
	}
	
	void speakerOn() {
		power = true;
		System.out.println("전원을 킵니다.");
	}
	void speakerOff() {
		power = false;
		System.out.println("전원을 끕니다.");
	}
	
	void soundUp(int loud) {
		
		if(sum>=0 && sum <= 50 && sum+loud <=50) {
			sum += loud;
			System.out.println("소리를 키웁니다.");
			System.out.println("현재 볼륨 : " + sum);
		}else
			System.out.println("최대 볼륨을 초과했습니다.");
	}
	void soundDown(int quiet) {
		if(sum>=0 && sum<=50 && sum-quiet>0) {
			sum -= quiet;
			System.out.println("소리를 줄입니다.");
			System.out.println("현재 볼륨" + sum);
		}else
			System.out.println("최저 볼륨을 초과했습니다.");
			
	}
}
