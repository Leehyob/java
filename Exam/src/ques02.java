
public class ques02 {

	public static void main(String[] args) {
		char ch = 'e';
		boolean b = (ch >= 'a' && ch <= 'z') || (ch >= 'A' || ch <= 'Z') || (ch >= 48 || ch <= 57);
		
		System.out.println(b);

	}

}
