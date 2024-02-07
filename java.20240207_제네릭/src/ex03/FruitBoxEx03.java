package ex03;

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

class Box<T>{
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
}



public class FruitBoxEx03 {

	public static void main(String[] args) {
		
		Box<Apple> box1= new Box();
		Box<Orange> box2 = new Box();
		
		box1.setObj(new Apple());
		box2.setObj(new Orange());
		
//		Apple ap = (Apple)box1.getObj();
//		Orange op = (Orange)box2.getObj();
		
		System.out.println(box1.getObj());
		System.out.println(box2.getObj());
		
		
		
	}

}
