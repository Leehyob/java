package ex05;

public class AudioBook extends Book{
	
	private double length;
	private String narrator;
	
	public AudioBook() {
		
	}
	AudioBook(String title, String author, int publicationYear, double length, String narrator){
		super(title, author, publicationYear);
		this.length =length;
		this.narrator=narrator;
		
	}
	
	void leng(double length) {
		this.length = length;
	}
	void narr(String narrator) {
		this.narrator = narrator;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println( "Length : [" + length + "]hours");
		System.out.println( "Narrator : [" + narrator + "]");
	}
	

}
