package ex04;

/*
 * 박스 제네릭 클래스 생성
 * 
 */
public class BoxEx01 {
	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(123);
//		int num = iBox.get();
		System.out.println(iBox.get());
		
		Box<Double> dBox = new Box<Double>();
		dBox.set(123.0);
		double dNum = dBox.get();
		System.out.println(dNum);
	}

}

class Box<T>{
	private T obj;
	
	void set(T obj) {
	this.obj = obj;	
	}
	 T get() {
		return obj;
	}
}