package chap06.lecture.encapsulation;

public class MyApp {
	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.speed = 100;
//		System.out.println(c1.speed);
//		c1.speed = -100;
		
		c1.setSpeed(300);
		System.out.println(c1.getSpeed());
		c1.setSpeed(-300);
		System.out.println(c1.getSpeed());
	}
}
