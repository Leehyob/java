package ex01;

/*
 * 메서드 명 : change
 * 매개변수 : int
 * 반환타입 : int[]
 * 기능 : change함수 정수값을 전달하면, 그 정수 수 만큼 배열을 생성해서 전달
 * 배열 안에는 1~10까지 난수 입력
 */


public class method03 {

	public static void main(String[] args) {
		System.out.println("정수 전달하면 정수 크기만큼 배열을 생성해서 돌려주네");
		int[] num =  change(3);
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	static int[] change (int num) {
		int[] arrNum = new int[num];
		
		for (int i=0; i<arrNum.length; i++)
			arrNum[i]=(int)(Math.random()*10)+1;
		return arrNum;
	}
}
