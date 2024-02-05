package chap08;

public class Car {
	int gasoline;
	
	Car(){
		
	}
	Car(int gasoline){
		this.gasoline = gasoline;
	}
	
	void total() {
		System.out.println("남은 가솔린 : " + gasoline);
	}
}

