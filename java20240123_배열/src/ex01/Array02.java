package ex01;

public class Array02 {

	public static void main(String[] args) {
		
		//int형 배열 생성 후 랜덤(1~100) 이용해서 배열 크기 10 값 저장
		//배열 총점, 평균 구하기
		
		double avg=0;
		int total=0;
		
		//1~100이 값을 랜덤하게 추출해서 저장
		
		int[] arrNum = new int[10];
		
		for(int i=0; i<arrNum.length; i++) {
			int num = (int)(Math.random()*100)+1;
			arrNum[i] = num;
		}
		
		for(int i=0; i<arrNum.length; i++)
			System.out.print(arrNum[i] + " ");
		
		System.out.println("\n------------------------------------------------");
		
		for(int i=0; i<arrNum.length; i++) 
			total += arrNum[i];
		
		avg = (double)total/arrNum.length;
		System.out.println("총점 : " + total + " 평균 : " + avg);
		
		int max =0;
		int num=0;
		
		for(int i=0; i<arrNum.length; i++) {
			if (arrNum[i]>max) {
				max = arrNum[i];
				num = i+1;
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println(num + "번 자리 숫자");
		
		//정렬
		
	
		
			

	}
}
