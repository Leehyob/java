package ex02;

public interface Information {
	
	void sayHi();	
	
	void feeling();
	
	default void language() {
		System.out.println("번역시스템");
	}
	
	static void sayBye(int lang) {
		if(lang == 1) {
			System.out.println("잘가");
		}else if(lang == 2)
		System.out.println("Bye");
		else if(lang == 3)
			System.out.println("再见。");
		else
			System.out.println("잘못된 접근입니다.");
		
	}
	
	
	
	
}
