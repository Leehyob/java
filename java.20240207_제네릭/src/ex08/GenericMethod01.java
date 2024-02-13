package ex08;
class Box<T>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	//<T> : 제네릭 메소드 표시
	//제네릭 메소드		//반환타입,makeBox:함수명(T o):매개변수
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o); //3)매개변수에 ""가 저장되어 있는 주소값 불러옴 4)obj에도 같은 공간이 저장됨
		return box;
	}
}
public class GenericMethod01 {

	public static void main(String[] args) {
		
		//1)String 타입으로 변환 후 makeBox 메소드에 대입//2)힙 생성 후 "" 값 저장
		Box<String> sBox = BoxFactory.makeBox("544");
		int num = Integer.parseInt(sBox.get());
		System.out.println(sBox.get()); ///String(문자열) 타입으로 출력
						//5)주소값 안에 저장된 값 출력
		System.out.println(num); //int(정수) 타입으로 출력 -> parseInt사용으로 문자열을 정수형으로 변환시켜줌
		
		//new Integer를 안붙여주면 스택공간에 저장됨, 붙여줌으로써 힙 공간에 저장
		Box<Integer> iBox = BoxFactory.makeBox(100);
		System.out.println(iBox.get());
	}

}
