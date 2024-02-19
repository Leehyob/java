package test;

public class Exam01 {

	public static void main(String[] args) {
		
		Shape sh = new Circle(5);
		System.out.println(sh.calcArea());
		
		sh = new Reotangle(3,4);
		System.out.println(sh.calcArea());
		
		Reotangle s = (Reotangle)sh;
		System.out.println(s.isSquare());
	}

}
