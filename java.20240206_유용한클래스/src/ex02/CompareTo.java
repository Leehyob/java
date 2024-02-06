package ex02;

public class CompareTo {

	public static void main(String[] args) {
		
		System.out.println(compareEx("Kor","Eng"));
		System.out.println(compareEx("Kor","Math"));
		System.out.println(compareEx("Kor","Kor"));
	
	}
	
	
	static int compareEx(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
