package chap14.lecture.api.methodref;

import java.util.Random;
import java.util.function.Supplier;

class Car{
	
}

public class MethodRefEx1 {
	public static void main(String[] args) {

//메소드 참조 가능 기준
//호출하는 메소드의 리턴타입이 추상메소드의 리턴타입과 동일하면 메소드 참조로 축약 가능
		
		
		//정적메소드 참조하는 경우 - 클래스::메소드
		Supplier<Double> random = () -> Math.random();
		Supplier<Double> ran2 = Math::random;

		
		//인스턴스메소드 참조하는 경우 - 참조변수::메소드
		Random rand = new Random();
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());		
		Supplier<Integer> nextInt = () -> rand.nextInt();
		Supplier<Integer> nextInt2 = rand::nextInt;
		
		//생성자 참조하는 경우 - (생성자의)클래스::new
		Supplier<Car> nextCar = () -> new Car();
		Supplier<Car> nextCar2 = Car::new;
		
	}
}
