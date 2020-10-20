package chap06.lecture.encapsulation;

public class Car {
	private int speed;
	private String model;
	private String name;
	private int price;
//데이터는 private로 외부 접근 차단
	
	public void setSpeed(int speed) {
		if(speed>=0) {
			this.speed = speed;
		}		
	}
//메소드를 공개함으로써 데이터에 접근
//데이터를 저장하는 역할의 set 메소드
	
	public int getSpeed() {
		return this.speed;
	}
//읽기 전용의 get 메소드
//정보를 읽어오고 가공도 get 메소드의 역할

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
//상단 바에 Source -> Generate getter and setter클릭
//자동으로 get, set method 생성
	
	
	
}
