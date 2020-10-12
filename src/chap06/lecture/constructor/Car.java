package chap06.lecture.constructor;

public class Car {
	String name;
	int price;
	
	//생성자
	//클래스명(parameter목록) {
    //	실행코드
	//};

	public Car() {
		System.out.println("생성자 실행됨");
		name = "kia";
		price = 500;
	}
//아무런 생성자가 없다면, java 컴파일러가 자동으로 생성자를 추가함
//생성자는 주로 필드값을 초기화 하는 역할
	
	public Car(String carName) {
		System.out.println("String 받는 생성자 실행됨");
		System.out.println(carName);
		name = carName; 
//생성자는 필드값을 초기화하는 역할이 주
//그래서 parameter값을 필드값으로 대입하는 경우가 많음
	}
	
	public Car(String carName, int carPrice) {
		name = carName;
		price = carPrice;
	}
//String parameter, int parameter가 있는 인스턴스를 호출할 때 생성자 실행
//생성자 () 안에 parameter의 타입과 개수에 따라 맞는 생성자 호출
}
