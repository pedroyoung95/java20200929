package chap07.textbook.s070702;

public class Car {
	//field
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontrightTire = new Tire("앞오른쪽", 2);
	Tire backleftTire = new Tire("뒤왼쪽", 3);
	Tire backrightTire = new Tire("뒤오른쪽", 4);
	
	//method
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontrightTire.roll()==false) {stop(); return 2;}
		if(backleftTire.roll()==false) {stop(); return 3;}
		if(backrightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
