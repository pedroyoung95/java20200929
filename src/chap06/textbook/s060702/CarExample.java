package chap06.textbook.s060702;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
//		Car myCar = newCar();
//특정 생성자가 이미 존재하므로 기본 생성자 자동 추가X, 호출도 안 됨.
		System.out.println(myCar.carColor);
		System.out.println(myCar.carCC);
	}
}
