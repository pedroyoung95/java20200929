package chap06.textbook.s060803;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
//자기 자신의 다른 method 호출 가능
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
