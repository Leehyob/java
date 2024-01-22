package ex03;

public class Exam01 {

	public static void main(String[] args) {
		
		int exam = 5000;
		int h = exam/3600;
		int t = exam%3600;
		int m = t/60;
		int s = t%60;
		
		System.out.println(h + "시간" + m + "분" + s + "초");
		
		int hour = exam/3600;
		int minute = (exam%3600)/60;
		int second = (exam%3600)%60;
		
		System.out.println(hour + "시간" + minute + "분" + second + "초");

	}

}
