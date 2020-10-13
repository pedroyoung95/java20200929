package chap06.textbook.exercises.p16;

public class Printer {
	void println(int i) {
		System.out.println(i);
//println()은 out이라는 객체의 method
//out은 System의 필드
//System . out ->System의 field . println() -> out의 method 
	}
	
	void println(boolean True) {
		System.out.println(True);
	}
	
	void println(double Double) {
		System.out.println(Double);
	}
	
	void println(String name) {
		System.out.println(name);
	}
}
