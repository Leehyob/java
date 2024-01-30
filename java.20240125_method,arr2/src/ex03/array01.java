package ex03;

public class array01 {

	public static void main(String[] args) {
		int[][] myArr = new int[2][4];
		myArr[0][0] = 2;
		myArr[0][1] = 5;
		myArr[0][2] = 7;
		myArr[0][3] = 4;
		myArr[1][0] = 9;
		myArr[1][1] = 3;
		myArr[1][2] = 2;
		myArr[1][3] = 8;
		
		int sum =0;
		int sum2=0;
		
		for(int i=0; i<4; i++) {
			sum += myArr[0][i];
		}
		System.out.println("첫번째 행의 합 : " + sum);
		for(int i=0; i<4; i++) {
			sum2 += myArr[1][i];
		}
		System.out.println("두번째 행의 합 : " + sum2);

	}

}
