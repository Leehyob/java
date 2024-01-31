package ex01;

public class Car {

	private String company = "현대 자동차";
	private String model = "그랜저";
	private String color = "검정";
	private int maxSpeed = 350;
	private int speed;
	
	Car() {
		
	}
	
	Car(String company, String model, String color, int maxSpeed, int speed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		
	}
	void other(int speed) {
		this.speed = speed;
	}
	
	void result() {
		System.out.println("제작회사 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색깔 : " + color);
		System.out.println("최대속도 : " + maxSpeed);
		System.out.println("현재속도 : " + speed);
	}
	
	
	
	
	
}
