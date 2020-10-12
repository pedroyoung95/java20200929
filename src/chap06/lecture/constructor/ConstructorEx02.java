package chap06.lecture.constructor;

public class ConstructorEx02 {
	public static void main(String[] args) {
		Hero h1 = new Hero("ironman", 100);
		Hero h2 = new Hero("thor", 200);
		System.out.println(h1.name);
		System.out.println(h1.power);
		
		Hero h3 = new Hero("spider");
		System.out.println(h3.name);
		System.out.println(h3.power);
	}
}
