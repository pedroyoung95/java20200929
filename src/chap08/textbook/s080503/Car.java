package chap08.textbook.s080503;

import chap08.textbook.s080502.*;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
//똑같은 인터페이스 타입이므로, 인터페이스 배열로 여러 인스턴스 값들을 저장
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
