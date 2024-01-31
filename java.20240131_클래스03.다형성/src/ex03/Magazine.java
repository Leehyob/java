package ex03;

public class Magazine extends Book{

	private String lutine;
	
	Magazine() {
	}
	Magazine(String title, String author, String publishYear, String lutine){
		super(title, author, publishYear);
		this.lutine = lutine;
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + lutine ;
	}
}

//System.out.println("발행 주기 : " + lutine);