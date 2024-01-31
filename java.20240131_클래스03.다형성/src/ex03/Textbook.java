package ex03;

public class Textbook extends Book{
	
	private String study;
	
	Textbook(){
		
	}
	Textbook(String title, String author, String publishYear, String study){
		super(title, author, publishYear);
		this.study = study;
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + study;
	}

}

//System.out.println("학문 : " + study);