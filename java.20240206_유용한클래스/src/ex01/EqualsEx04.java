package ex01;

public class EqualsEx04 {

	public static void main(String[] args) {
		Box3 b1 = new Box3("Kor");
		Box3 b2 = new Box3("Kor");
	
		System.out.println("1 >>" + (b1 == b2));
		System.out.println("2 >>" + (b1.equals(b2)));
	}

}

class Box3{
	String str;
	
	public Box3(String str) {
		this.str = str;
	}
	//equal 메소드 재정의

	@Override
	public boolean equals(Object obj) {
		Box3 b = (Box3)obj;
		return str==b.str;
// return this.str.equals(b.str)
	} 
	
}