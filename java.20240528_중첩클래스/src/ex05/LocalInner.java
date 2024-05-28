package ex05;

class localClass{
	
	private int localClass = 1;	//인스턴스 변수 -> 객체가 생성될 떄 만들어 짐
	
	public void func() {
		
		int localVar =2;	//지역변수 -> 값 변경 불가(final 과 같음)
		// public, private 같은 접근 제한자 사용 불가
		
		class InnerClass{	//인스턴스 변수 -> 객체가 생성될 떄 만들어 짐
			
			int innerVar = 3;
			
			public void print() {
				System.out.println(localClass);
				System.out.println(localVar);
				System.out.println(innerVar);
			}
		}
		
		InnerClass inner = new InnerClass();
		inner.print();
		
	}
}

public class LocalInner {

	public static void main(String[] args) {
		localClass lc = new localClass();
		lc.func();
	}
	
}
