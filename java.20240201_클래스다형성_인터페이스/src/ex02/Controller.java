package ex02;

public class Controller {

	public static void main(String[] args) {
		
		Information info = new Chinese();
		Information info2 = new English();
		
		infor(new Korean());
		infor(new Chinese());
		infor(new English());
		
		lang(new Korean());
		lang(new Chinese());
		
		
		Information.sayBye(2);
		
		
		
	}
	
	static void infor(Information information) {
		information.feeling();
	}
	
	static void lang(Information information) {
		information.language();
	}

}
