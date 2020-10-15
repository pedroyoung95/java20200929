package chap07.lecture.polymorphism.sample;

public class MyApp {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setGun(new FireGun());
		
		hero.attack();
		
		hero.setGun(new WaterGun());
		hero.attack();
	}
}
