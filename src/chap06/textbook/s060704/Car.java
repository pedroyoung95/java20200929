package chap06.textbook.s060704;

public class Car {
	//field
	String company = "대한민국";
	String model;
	String color;
	int maxSpeed;
	
	//constructor
	Car() {
		
	}
	
	Car(String model) {
		
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
