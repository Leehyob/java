package ex12;


class Box<T>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
	public String toString() {
		return obj.toString();
	}
}
		
class UnBoxer<T>{
	//제네릭 메소드
	public  static <T> void openBox(Box<T> box){
		System.out.println(box);
	}
	//와일드 메소드
	public static void peekBox(Box<?> box) {	// ? : 와일드 카드, 제네릭 메소드와 기능은 똑같으나 간편화. 개입해줘야 할 내용이 적어짐
//		System.out.println(box);
		 String str = box.toString();
		 System.out.println("str : " +str);
	}

}

public class GenericMethod05{
	public static void main(String[] args) {
		Box<Integer> sbox = new Box<Integer>();
		
		sbox.set(100);

		UnBoxer.peekBox(sbox);	//문자열
		UnBoxer.<Integer>openBox(sbox);	//정수
	
	
	}
}