package ex04;

public class Student02 {
	
	String name01;
	int studentId01;
	String major01;
	
	Student02(){
		
	}
	
	void setName(String a) {
		name01 = a;
	}
	void setStudentId(int b) {
		studentId01 = b;
	}
	void setMajor(String c) {
		major01= c;
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
