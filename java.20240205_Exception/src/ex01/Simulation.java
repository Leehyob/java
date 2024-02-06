package ex01;

public class Simulation {

	public static void main(String[] args) {
		Buyer b= new Buyer();
		
		b.buy(new Tv());
		
		b.summary();
	
	}

}
