package ex01;

public class Switch03 {

	public static void main(String[] args) {
		int jumsu = 45;
		
		if(jumsu >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		String msg = ( jumsu >= 60 ) ? "합격" : "불합격";
		System.out.println(msg);
		
		
			

	}

}
