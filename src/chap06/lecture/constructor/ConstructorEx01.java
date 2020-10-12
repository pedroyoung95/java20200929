package chap06.lecture.constructor;

public class ConstructorEx01 {
	public static void main(String[] args) {
		Car car1 = new Car();
//new 연산자 + Car() 생성자 -> 새로운 인스턴스 생성
//= 연산자를 통해 car1 변수에 들어감.(객체이므로, 주소값이 car1에 저장됨)
		Car car2 = new Car();
		
		System.out.println(car1.name);
		System.out.println(car1.price);
		
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		Car car3 = new Car("volvo");
		Car car4 = new Car("benz");
		
		System.out.println(car3.name);
		System.out.println(car4.name);
		
		System.out.println(car3.price);
		System.out.println(car4.price);
		
		Car car5 = new Car("hyundai", 700);
		
		System.out.println(car5.name);
		System.out.println(car5.price);
		
		Car car6 = new Car("samsumg", 800);
		System.out.println(car6.name);
		System.out.println(car6.price);
	}
}
