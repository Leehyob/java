package ex04;

public class SpeakerController {

	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		
		speaker.speakerOn();
		speaker.soundUp(57);
		speaker.soundUp(20);
		speaker.soundDown(1);
		speaker.speakerOff();
	}

}
