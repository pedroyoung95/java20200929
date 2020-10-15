package chap07.textbook.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);

		driver.drive(taxi);
//Bus, Taxi는 Vehicle클래스를 상속받았으므로 vehicle parameter로 사용 가능
	}
}
