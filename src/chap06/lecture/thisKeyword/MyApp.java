package chap06.lecture.thisKeyword;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.var = 3;
		o1.method1();
		
		System.out.println("-----------------");
		o1.method2();
		
		MyClass o2 = new MyClass();
		o2.var = 9;
		o2.method2();
	}
}
