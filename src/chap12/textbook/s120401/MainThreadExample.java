package chap12.textbook.s120401;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
//		User1 user1 = new User1();
//		user1.setCalculator(calculator);
//		user1.start();
		
	}
}