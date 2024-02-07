package ex02;

public class WrapperEx01 {

	public static void main(String[] args) {
		//기본자료형 8개 빼고는 다 객체
		
		int i =10;
		
//		Integer iref = new Integer(10); //사용 자제. 밑의 명령문과 같음
		
		Integer iref2 = 20; //new Integer(20)
		
		i = iref2;
		i = iref2.intValue(); // Integer -> int
		
		iref2 = i;  //new Integer(i) -> 오토박싱
	
	}

}

