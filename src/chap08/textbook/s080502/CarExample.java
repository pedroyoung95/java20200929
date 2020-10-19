package chap08.textbook.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
//KumhoTire도 Tire를 구현했지만, Tire인터페이스 변수에 
//HankookTire 인스턴스가 할당되었으므로, HankookTire 인스턴스의 메소드 실행
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
//인터페이스 타입 변수 중 앞쪽 바퀴들만 KumhoTire 인스턴스 할당
//이후부터는 KumhoTire 인스턴스의 메소드가 실행		
		myCar.run();
	}
}
