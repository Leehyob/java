package ex01;

public class Result {

	public static void main(String[] args) {
		
		Car car = new Car("현대 자동차", "그랜저", "검정", 350, 0);
		
		car.result();
		
		car.other(60);
		
		car.result();
		
		

	}

}
