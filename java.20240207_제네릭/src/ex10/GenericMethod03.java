package ex10;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
//@Override
//public String toString() {
//	
//	return obj.toString();
//}

}

class BoxFactory {
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box();
		box.set(o);
		System.out.println("Boxed : " + o.intValue());
										// (1)intValue()는 프로그램 내에서 자동 생성되기 때문에
										// 생략해도 자동으로 언박싱 해줌. 꼭 넣을 필요x
										// 여기서는 언방식을 해야하는 지점을 보여주기 위해 표시
		return box;
	}

	public static <T extends Number> T trueBox(Box<T> a) {
		System.out.println("true Box : " + a.get().intValue());
												// (1)以下同文
		return a.get();
	}

}

class Unboxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("unboxed : " + box.get());
		return box.get();
	}
}

public class GenericMethod03 {

	public static void main(String[] args) {
		Box<Integer> ibox = BoxFactory.makeBox(new Integer(100));
		Box<Integer> abox = new Box<>();
		System.out.println(ibox.get());
//		System.out.println(ibox);
		int num = Unboxer.openBox(ibox);
		System.out.println("data : " + num);
//		System.out.println(ibox);
//		String str = String.valueOf(ibox); //반환값이 box자체이기 때문에 저장된 위치 출력
//		System.out.println(str);		  
//		String str2 = String.valueOf(num);
//		System.out.println(str2);
//		System.out.println(ibox);
//		Box<Double> dbox = BoxFactory.makeBox(10.2);
//		double num2 = BoxFactory.trueBox(dbox);
//		System.out.println(num2);
//		System.out.println(ibox);

	}

}


