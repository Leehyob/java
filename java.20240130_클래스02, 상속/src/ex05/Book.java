package ex05;

public class Book {
	private String title;
	private String author;
	private int publicationYear;
	
	Book(){
		
	}
	Book(String title, String author, int publicationYear){
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	void title01(String title) {
		this.title = title;
	}
	void author01(String author) {
		this.author = author;
	}
	void pub(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	void displayInfo() {
		System.out.println(" Title : [" + title + "]");
		System.out.println( "Author : [" + author + "]");
		System.out.println( "Year : [" + publicationYear + "]");
	}
}
