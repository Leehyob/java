package ex07;

//박스 클래스에서 생성되는 대상은 정수 및 실수만 가능하게 생성
class Box<T extends Number>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
public class BoxEx03 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box<Integer>();
		Box<Double> dbox = new Box<Double>();
		
//		Box<String>sbox = new Box<String>(); 		//Box 클래스가 Number까지로 범위를 제한하면서 String형인 sbox는 받아들여지지 않음
	}

}
