package chap07.textbook.exercises.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
//tire변수에 snowTire가 담겨있으므로 tire에는 snowTire인스턴스의 참조값이 저장
//method를 실행하면 재정의한 snowTire인스턴스의 method가 실행	
		System.out.println(tire == snowTire);
	}
}
