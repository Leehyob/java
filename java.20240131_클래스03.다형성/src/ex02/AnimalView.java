package ex02;

public class AnimalView {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		ani.makeSound();
		
		Animal ani2 = new Dog();
		ani2.makeSound();
		
		Animal ani3 = new Cat();
		ani3.makeSound();
		Cat cat = new RussianBlue();
		cat.color();
		cat.eat();
		Cat cat2 = new ShortHair();
		cat2.color();
		cat2.eat();
		
		Animal ani4 = new Bird();
		ani4.makeSound();
		
		Animal ani5 = new Chu();
		ani5.makeSound();
		Dog ani6 = new Chu();
		ani6.eat();	
		
		sound(new Bird());
		sound(new Cat());
		sound(new Dog());
		catEat(new ShortHair());
		dogSound(new Chu());
		catEat(new NormalCat());
		
		}
	static void sound(Animal animal) {
		animal.makeSound();
	}
	static void catEat(Cat cat) {
		cat.eat();
	}
	static void dogSound(Dog dog) {
		dog.makeSound();
	}

}
