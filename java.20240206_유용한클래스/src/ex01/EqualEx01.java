package ex01;

public class EqualEx01 {

	public static void main(String[] args) {
		
		String str = new String("Korea");
		String str1 = new String("Korea");
		
//		System.out.println(str == str1); //다른 heap 공간을 참조하기 때문에 주소값이 달라 false 출력
		
		System.out.println(str.equals(str1)); //참조 주소 안 값을 비교 = true 출력
	}
}

