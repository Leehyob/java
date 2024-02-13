package ex14;


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

class UnBoxer<T>{					//Integer나 Integer 위의 상위 클래스 모두 참조 가능(하한제한)
	public static void peekBox(Box<? super Integer> box) {	// ? : 와일드 카드
		System.out.println(box);							
	}

}
class A{
	@Override
	public String toString() {
		
		return "April";
	}
}

public class GenericMethod07{
	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box();
		ibox.set(1234);
		UnBoxer.peekBox(ibox);
		
		Box<Object> dbox = new Box<Object>();
		dbox.set("gkdld");
		System.out.println(dbox);
		
		Box<Object> obox = new Box<Object>();
		obox.set(new A());
		UnBoxer.peekBox(obox);
		
	}
}