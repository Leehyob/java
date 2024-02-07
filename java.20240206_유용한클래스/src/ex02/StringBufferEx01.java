package ex02;

public class StringBufferEx01 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc").append(123).append(345);
		
		System.out.println(sb);
	}

}

