package ex09;


class Box<T>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}
public class GenericMethod02 {

	public static void main(String[] args) {
		Box<String> sBox = new Box<String>();
		sBox.set("Korea");
		String str = Unboxer.openBox(sBox);
		
		System.out.println(str);
//		 = System.out.println(sBox.get());
	}

}
