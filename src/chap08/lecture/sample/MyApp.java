package chap08.lecture.sample;

public class MyApp {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.setGun(new FireGun());
		h1.attack();
		
		h1.setGun(new WaterGun());
		h1.attack();
	}
}
