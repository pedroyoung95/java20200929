package chap06.lecture.method;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.var1 = 3; //필드에 3이라는 값 할당
		o1.myMethod();
//생성자처럼 메소드도 변수이름과 .(dot)으로 연결
//		o1.yourMethod();
		
		MyClass o2 = new MyClass();
		o2.myMethod();
		
		o2.MyMethod2(5);
		o2.MyMethod2(7);
		
		o1.MyMethod2(7);
		
		o1.MyMethod3(1, 2);
	}
}
