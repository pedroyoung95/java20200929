package chap07.textbook.s070703;

import chap07.textbook.s070702.HankookTire;
//HankookTire클래스의 생성자를 사용하면 super를 통해 Tire클래스의 생성자 호출
//하지만 Tire를 import해도 HankookTire는 자식클래스이기 때문에 
//HankookTire의 생성자에는 접근불가
//따라서, HankookTire를 import해서 Tire생성자까지 사용하거나
//*로 바꿔서 모든 클래스를 사용해야 함

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);				
			}
			System.out.println("-------------------------");
		}
	}
}
