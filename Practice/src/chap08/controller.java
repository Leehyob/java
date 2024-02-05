package chap08;

public class controller {

	public static void main(String[] args) {
		
		Car car = new HybridWaterCar();
		
		car.total();
		
		HybirdCar hCar = (HybirdCar)car;
		
		hCar.elec();
		
		HybridWaterCar wCar = (HybridWaterCar)hCar;
		
		wCar.mul();
	}

}
