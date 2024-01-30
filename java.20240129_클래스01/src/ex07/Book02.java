package ex07;

public class Book02 {

	private String title;
	private String author;
	private String publisher;
	private int price;
	Book02(){
		this("제목 없음", "작가 없음", "출판사 없음", 0);
	}
	
	Book02(String a, String b, int d){
		this(a,b,"출판사 없음", d);
		
	}
	Book02(String a, String b, String c, int d){
		title = a;
		author = b;
		publisher = c;
		price = d;
	}
	
	
	void tit() {
		System.out.println("제목 : ");
	}
	void aut() {
		System.out.println("저자 : ");
	}
	void pub() {
		System.out.println("출판사 : " );
	}
	void pri() {
		System.out.println("가격 : ");		
	}


	void displayBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
	}
}

