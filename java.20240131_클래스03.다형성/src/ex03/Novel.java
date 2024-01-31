package ex03;

public class Novel extends Book{
	private String genre;
	Novel(){
		
	}
	Novel(String title, String author, String publishYear, String genre){
		super(title, author, publishYear);
		this.genre = genre;
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + genre;
	}
	
	void phrase() {
		System.out.println("문장");
	}

}

//System.out.println("장르 : " + genre);