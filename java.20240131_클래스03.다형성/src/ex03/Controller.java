package ex03;

public class Controller {

	public static void main(String[] args) {
		
		
		details(new Book("연금술사", "파울로 코엘료", "2000"));
		details(new Novel("끝없는 이야기", "미하엘 엔데", "1990", "판타지"));
		details(new Textbook("JAVA 마스터","송미영","2023","java"));
		details(new Magazine("GQ","ㅁㄹ","2005","1 month"));
		
		notice(new Novel01());
		notice(new Novel02());
		
		Book b = new Novel();
		Novel novel = new Novel();
		
		
		Novel a = new Novel01();
		Novel01 c = new Novel01();
		
		
		c.phrase();
		
		System.out.println(novel.getDetails());
	}
	
	static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
		System.out.println("-----------------------------");
	}
	static void notice(Novel novel) {
		novel.phrase();
	}
}
