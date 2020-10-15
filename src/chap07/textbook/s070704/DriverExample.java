package chap07.textbook.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
//Bus, Taxi인스턴스를 만들면
//부모클래스인 Vehicle의 생성자와 인스턴스도 만들어짐
		
		driver.drive(bus);
		driver.drive(taxi);
//Bus, Taxi는 Vehicle클래스를 상속받았으므로 
//vehicle타입의 parameter로 사용 가능
//override된 메소드라면 override한 자식클래스의 인스턴스의 메소드가 실행
	}
}
