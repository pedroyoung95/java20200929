package chap07.textbook.s070703;

import chap07.textbook.s070702.Tire;

public class Car {
	//field
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)			
	};
	
	//method
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
//i+1를 return하는 이유: i값이 0부터 시작해서 0이 나오게 하지 않도록
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
 