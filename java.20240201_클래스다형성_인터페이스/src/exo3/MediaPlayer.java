package exo3;

public interface MediaPlayer {
	
	default void ques() {
		
	}
	
	
	
	void play();
	void stop();
	void pause();
	
	default void loadFile(String name, String length, String file) {
		
	}
}
