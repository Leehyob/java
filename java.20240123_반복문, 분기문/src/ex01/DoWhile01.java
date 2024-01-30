package ex01;

public class DoWhile01 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=0;
		
		do {
			i++;
			sum += i; //증가식 먼저
		}while(i<10); //이후 조건식 그래서 조건이 최소 한 번은 참, 거짓에 상관없이 실행
		
		System.out.println("sum : " + sum);
		
		
		int num=0;
		int n=1;
		
		do {
			num += n;
			n++;		
		}while(n<=10);// 위의 식과 답은 같으나 식 달라짐
		
		System.out.println("num : " + num);
	}

}
