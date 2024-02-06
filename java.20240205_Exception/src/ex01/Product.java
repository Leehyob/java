package ex01;

class Product {
	int price;
	
	Product(int price){
		this.price = price;
	}
	
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(100);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money =1000;
	Product[] cart = new Product[3];
	int i =0;
		
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
		
	void add(Product p) {
		int sum = 0;
		
			if(i>=cart.length) {
				Product[] cart2 = new Product[cart.length*2];
				for(int i=0; i<cart.length; i++) {
				cart2[i] = cart[i];
				cart = cart2;
			}
			
			}
			cart[i++]=p;
			
			
		}
	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i=0; i<cart.length; i++) {
			itemList += cart[i] + ",";
			sum += cart[i].price;
			}
		System.out.println("구입 : " + itemList);
		System.out.println("사용 : " + sum);
		System.out.println("잔고 : " + money);
			
		
	}
}