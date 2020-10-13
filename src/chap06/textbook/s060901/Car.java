package chap06.textbook.s060901;

public class Car {
	//field
	String model;
	int speed;
	
	//constructor
	Car(String model) {
		this.model = model;
	}
	
	//method
	void setSpeed(int speed) {
		this.speed = speed;
//parameter를 사용하는 객체의 speed값에 대입
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
//사용하는 객체에 대해서 setSpeed() method 실행
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
}
