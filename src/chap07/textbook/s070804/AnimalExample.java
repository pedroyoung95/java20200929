package chap07.textbook.s070804;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
//클래스에서 직접 인스턴스를 만들어서 각각의 메소드 실행
		
		
		//변수의 자동타입변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
//부모타입으로 자동형변환 한 후 메소드 실행(인스턴스의 메소드 실행)
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());		
//인스턴스의 메소드를 실행시키는 메소드에 인스턴스를 parameter로 넣어서 실행
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
