package chap08;

public class HybridWaterCar extends HybirdCar{
	int water;
	
	public HybridWaterCar() {
	}
	HybridWaterCar(int gasoline, int electric, int water){
		super(gasoline, electric);
		this.water = water;
	}
	
	void total() {
		super.total();
		System.out.println("남은 워터량 : " + water);
		
	}
	
	void mul() {
		System.out.println(water);
	}
}
