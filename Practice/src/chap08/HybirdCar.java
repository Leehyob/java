package chap08;

public class HybirdCar extends Car{
	int electric;
	
	public HybirdCar() {
	}
	HybirdCar(int gasoline, int electric){
		super(gasoline);
		this.electric = electric;
	}
	
	@Override
	void total() {
		super.total();
		System.out.println("남은 전기량 : " + electric);
		
		
	}
	void elec() {
		System.out.println(electric);
	}
	
}
