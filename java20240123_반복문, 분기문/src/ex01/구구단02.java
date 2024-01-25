package ex01;

public class 구구단02 {

	public static void main(String[] args) {
		
		for(int i=2; i<=4; i++)
			for(int j=1; j<=9; j++)
				System.out.println(i + "x" + j + "=" + i*j);

		/*2단 2개
		 * 3단 3개
		 * 4단 4개
		 */
		for(int a=2; a<=4; a++)
			for(int b=1; b<=9; b++) {
				if(a==b) break;
					System.out.println(a + "x" + b + "=" + a*b);
			}
	}

}
