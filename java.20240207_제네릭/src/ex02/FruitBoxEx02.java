package ex02;
/*
 * 이 코드 문제점
 * 1. 이 박스에는 사과, 오렌지만 담고 싶은데 다른 게 담겨도 제어 불가
 * 2. get 할 때, 형변환을 해야 함(다운캐스팅을 해야 함)
 */

class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange { 
	public String toString() {
		return "I am an Orange";
	}
}

class Box{
	private Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
	
}



public class FruitBoxEx02 {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.setObj(new Apple());
		box2.setObj(new Orange());
		
		Apple ap = (Apple)box1.getObj();
		Orange op = (Orange)box2.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
	}

}
