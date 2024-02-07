package ex01;
/*
 *이 코드의 문제점
 *1. AppleBox, OrangeBox가 거의 비슷
 *2.한 박스에 사과, 오렌지 담고 싶음 
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

class AppleBox{
	private Apple ap;
	
	void setAp(Apple ap) {
		this.ap = ap;
	}
	
	Apple getAp() {
		return ap;
	}
	
}

class OrangeBox{
	private Orange op;
	
	void setOp(Orange op) {
		this.op = op;
	}
	Orange getOp() {
		return op;
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());
		oBox.setOp(new Orange());
		
		System.out.println(aBox.getAp());
		System.out.println(oBox.getOp());
	}

}
