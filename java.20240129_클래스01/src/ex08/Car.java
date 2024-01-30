package ex08;

import java.util.Scanner;

public class Car {

	private String make;
	private String model;
	private String year;
	private String color;
	
	Car(){
		
	}
	Car(String make,String model,String year,String color){
		this.make = make;
		this.model = model;
		this.year = year;
		this.color =color;
	}

	
	void setAll(String make, String model, String year, String color) {	
		this.make = make;
		this.model = model;
		this.year = year;
		this.color =color;
		
	}
	private boolean engine;
	
	boolean startEngine() {
		return engine = true;
	}
	void question() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시스템을 종료하시겠습니까?\n Y/N : ");
		String e = sc.nextLine();
	}
	
	
	boolean stopEngine() {
		return engine = false;
	}
	void displayCarDetails(){
		System.out.println("제조사 : " + make);
		System.out.println("모델 : " + model);
		System.out.println("제조년도 : " + year);
		System.out.println("색상 : " + color);
	}
	
}
