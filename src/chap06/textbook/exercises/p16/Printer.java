package chap06.textbook.exercises.p16;

public class Printer {
	int i;
	boolean True;
	double Double;
	String name;
	
	void println(int i) {
		this.i = i;		
		System.out.println(i);
	}
	
	void println(boolean True) {
		this.True = True;
		System.out.println(True);
	}
	
	void println(double Double) {
		this.Double = Double;
		System.out.println(Double);
	}
	
	void println(String name) {
		this.name = name;
		System.out.println(name);
	}
}
