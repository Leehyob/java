package ex03;

public class Student {
	
	private String name01;
	private int studentId01;
	private String major01;
	
	Student(){
		
	}
	
	Student(String a, int b, String c){
		name01 = a;
		studentId01 = b;
		major01 = c;
	}

	void name() {
		System.out.println("이름 : " + name01);
	}
	void studentId(){
		System.out.println("학번 : " + studentId01);
	}
	void major() {
		System.out.println("전공 : " + major01);
	}
	
	void displayInformation() {
		System.out.println("이름 : " + name01);
		System.out.println("학번 : " + studentId01);
		System.out.println("전공 : " + major01);
	}
	
}
