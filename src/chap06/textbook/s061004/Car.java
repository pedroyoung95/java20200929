package chap06.textbook.s061004;

public class Car {
//	int speed;
//	
//	void run() {
//		System.out.println(speed + "으로 달립니다.");
//	}
	
	static int speed;
	
	static void run() {
		System.out.println(speed + "으로 달립니다.");
//out은 객체 생성 없이 호출 가능하므로
//System 클래스의 멤버임 
	}
	
	
//	public static void main(String[] args) {
//		Car myCar = new Car();
//		myCar.speed = 60;
//		myCar.run();
//	}
	
	public static void main(String[] args) {		
		speed = 60;
		run();
	}
}
