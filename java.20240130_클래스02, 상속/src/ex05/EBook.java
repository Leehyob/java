package ex05;

public class EBook extends Book{
	private double fileSize;
	private String format;
	
	EBook(){
		
	}
	
	EBook(String title, String author, int publicationYear, double fileSize, String format){
		super(title, author, publicationYear);
		this.fileSize = fileSize;
		this.format = format;
		
	}
	
	void file(double fileSize) {
		this.fileSize = fileSize;
	}
	void form(String format) {
		this.format = format;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println( "File Size : [" + fileSize + "]");
		System.out.println( "Format : [" + format + " MB]");
	}

}
