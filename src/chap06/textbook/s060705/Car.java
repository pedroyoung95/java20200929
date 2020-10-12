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
