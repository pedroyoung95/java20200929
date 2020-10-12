package chap06.textbook.s060705;

public class Car {
	//field
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
			
	//constructor
	Car() {
				
	}
	
	Car(String model) {
		this(model, "은색", 250);
//this() -> 클래스의 다른 생성자 호출
//괄호 안 변수 타입이나 값이 맞는 다른 생성자를 호출
//호출된 생성자의 실행코드를 똑같이 실행할 수 있게 됨
//this는 클래스, 여기선 Car를 지칭하므로 this()는 곧 Car() 생성자와 동일
	}
	
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
