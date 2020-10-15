package chap07.textbook.exercises.p07;

public class SnoTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		System.out.println(tire == snowTire);
	}
}
