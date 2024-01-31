package ex03;

public class Book {
	private String title;
	private String author;
	private String publishYear;
	
	Book(){
		
	}
	Book(String title, String author, String publishYear){
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	
	String getDetails() {
		return title + ":" + author + ":" + publishYear + ":";
	}
	
}

//void getDetails() {
//System.out.println("제목 : " + title);
//System.out.println("저자 : " + author);
//System.out.println("출판 연도 : " + publishYear);