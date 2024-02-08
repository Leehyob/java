package ex01;

public class 로또02 {

	public static void main(String[] args) {
		
		int a =10;
		int b =20;
		
		System.out.println(a + " : " + b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a + " : " + b);
		
		//값을 서로 바꿀 때는 또 다른 변수 필요
		
		int[] lotto = new int[45];
		
		for(int i = 0; i<lotto.length; i++) 
			lotto[i] = i+1;
		
		for(int i = 0; i<1000; i++) {
			int num = (int)((Math.random()*44)+1); //3
			int tmp = lotto[0];
			lotto[0] = lotto[num]; 
			lotto[num] = tmp; 
				
		}
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " ");
		
	}

}
