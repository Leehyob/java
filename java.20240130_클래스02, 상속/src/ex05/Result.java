package ex05;

public class Result {

	public static void main(String[] args) {
		AudioBook audio = new AudioBook("a", "b",20,10.5,"c");
		audio.displayInfo();
		System.out.println("----------------------------------");		
		EBook ebook = new EBook("a", "b", 10, 20.5, "4");
		ebook.title01("skdml");
		ebook.displayInfo();
		ebook.form("nb");
		ebook.displayInfo();
		System.out.println("----------------------------------");
		Book book = new Book();
		book.displayInfo();
		
		
	}

}
