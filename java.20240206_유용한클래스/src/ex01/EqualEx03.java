package ex01;

public class EqualEx03 {

	public static void main(String[] args) {
		
		Box2 b1 = new Box2(10);
		Box2 b2 = new Box2(10);
	
		System.out.println("1 >>" + (b1 == b2));
		System.out.println("2 >>" + (b1.equals(b2)));
		
	}
}

class Box2{
	int x;
	
	public Box2(int x) {
		this.x = x;
	}
	//equal 메소드 재정의

	@Override
	public boolean equals(Object obj) {
			return x == ((Box2)obj).x;
	} //equal 메소드 재정의 --> 타입 변환으로 접근 가능하게 만들어서 비교
	
}