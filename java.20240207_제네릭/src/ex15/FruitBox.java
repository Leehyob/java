package ex15;

import java.util.ArrayList;

class Fruit{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}
class Toy {
	public String toString(){
		return "Toy";
	}
}
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}
public class FruitBox {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		System.out.println(fruitBox.get(0));
		
		grapeBox.add(new Grape());
		grapeBox.add(new Grape());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
//		appleBox.add(new Toy());

		toyBox.add(new Toy());
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		System.out.println(toyBox.get(1));
//		toyBox.add(new Apple());

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println(toyBox);
		System.out.println(appleBox.size());
		System.out.println(fruitBox.size());
		
		
	}

}
