package java01;

public class java03 {

	public static void main(String[] args) {
		
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String subString = subject.substring(location);
		System.out.println(subString);
		
		location = subject.indexOf("관련");
		if(location!=-1)
			System.out.println("자바와 관련된 책이군요.");
		else
			System.out.println("자바와 관련 없는 책이군요.");
			
		
		boolean result = subject.contains("자바");
		if(result)
			System.out.println("자바와 관련된 책이군요.");
		else
			System.out.println("자바와 관련 없는 책이군요.");
		
		int[] scores;
		
		scores = new int[]{83,90,87};
		double[] a = {10.2,20.1,30.1};
		int sum1 = 0;
		for(int i=0; i<3; i++)
			sum1 += scores[i];
		System.out.println("총합 : " + sum1);
		
		printItem(scores);
		
		System.out.println();
		
		printItem(a);
		
			
	}
	static void printItem(int[]scores) {
		for(int i=0; i<3; i++)
			System.out.print(" + i + " + scores[i]);
	}
	static void printItem(double[] score) {
		for(int i=0; i<3; i++)
			System.out.print(" i : " + score[i]);
		
	}
}
