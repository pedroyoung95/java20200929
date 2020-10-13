package chap06.lecture.method;

public class MyAppReturn {
	public static void main(String[] args) {
		MyClassReturn o1 = new MyClassReturn();
		o1.method1();
		o1.var1 = 5;
		int v = o1.method2();
		
		System.out.println(v);
	}
}
