package ex04;

class Outer{
	 private int num =10;
	
	 int get() {
		 return num;
	 }
	 
	class Number{
		void add(int num) {
			Outer.this.num = num;
		}
		
		int get() {
			return num*2;
		}
	}
}

public class MemberInnerClass {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		System.out.println(o1.get());
		
		Outer.Number o2m1 = o1.new Number();
		System.out.println(o2m1.get());
		//一樣的			
		Outer.Number o1m2 = new Outer().new Number();
		System.out.println(o1m2.get());
	}
}
