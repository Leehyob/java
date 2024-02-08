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
	public  static <T> void openBox(Box<T> box){
		System.out.println(box);
	}
	public static void peekBox(Box<?> box) {	// ? : 와일드 카드
//		System.out.println(box);
		 String str = box.toString();
		 System.out.println("str : " +str);
	}

}

public class GenericMethod05{
	public static void main(String[] args) {
		Box<Integer> sbox = new Box();
		
		sbox.set(100);

		UnBoxer.peekBox(sbox);
		UnBoxer.<Integer>openBox(sbox);
	
	
	}
}