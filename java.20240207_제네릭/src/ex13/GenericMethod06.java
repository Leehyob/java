package ex13;


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

class UnBoxer<T>{					//Number나 Number 밑의 모든 클래스 가능(상한제한)
	public static void peekBox(Box<? extends Number> box) {	// ? : 와일드 카드
		System.out.println(box);						
	}

}

public class GenericMethod06{
	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box();
		ibox.set(1234);
		UnBoxer.peekBox(ibox);
		
		Box<Double> dbox = new Box();
		dbox.set(12.5);
		UnBoxer.peekBox(dbox);
		
		
	
	}
}