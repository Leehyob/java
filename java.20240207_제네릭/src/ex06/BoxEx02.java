package ex06;

class A{
	@Override
	public String toString() {
		return "A class";
	}
}
class B extends A{
	@Override
	public String toString() {
		return "B class";
	}
}
class C extends B{
	@Override
	public String toString() {
		return "C class";
	}
}
//제네릭에 extends + 클래스명을 적어주면 A거나 A를 상속한 클래스만 받아줌
class Box<T extends A>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
public class BoxEx02 {

	public static void main(String[] args) {
		Box<A> abox = new Box<A>();
		Box<B> bbox = new Box<B>();
		Box<C> cbox = new Box<C>();
		
//		Box<Integer> ibox = new Box();		//오류 -> A도 아니고 A의 하위클래스도 아닌 Integer는 받아주지 않음
		
	}

}
