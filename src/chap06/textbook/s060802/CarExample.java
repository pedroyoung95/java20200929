package chap06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		myCar.setGas(5);
		myCar2.setGas(7);
		System.out.println(myCar.gas);
		System.out.println(myCar2.gas);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
